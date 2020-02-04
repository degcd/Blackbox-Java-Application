package beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.ejb.Singleton;
import javax.ejb.Startup;

import entities.StatisticGameObject;
import entities.StatisticScenarioPath;
import entities.StatisticUserObject;
import exceptions.GameAlreadyExistsException;
import exceptions.GameDoesNotExistException;
import exceptions.StatisticNotSavedException;
import interfaces.IStatisticCalculator;
import persistency.StatisticSaver;

@Startup
@Singleton
public class StatisticCalculatorBean implements IStatisticCalculator {

	Map<Long, StatisticScenarioPath> gameMap;
	LinkedList<StatisticScenarioPath> completedGames;
	private String desktopPath = System.getProperty("user.home") + "/Desktop/paths.xml";

	public StatisticCalculatorBean() {
		gameMap = Collections.synchronizedMap(new HashMap<Long, StatisticScenarioPath>());
		completedGames = new LinkedList<StatisticScenarioPath>();
		StatisticSaver saver = new StatisticSaver();
		List<StatisticScenarioPath> ssps = saver.loadScenarioPaths(desktopPath);
		for (StatisticScenarioPath ssp : ssps) {
			gameMap.put(ssp.getGameID(), ssp);
		}
	}

	public void createNewGamePath(StatisticScenarioPath path)
			throws StatisticNotSavedException, GameAlreadyExistsException {
		if (!gameMap.containsKey(path.getUserID())) {
			gameMap.put(path.getUserID(), path);
			StatisticSaver saver = new StatisticSaver();
			List<StatisticScenarioPath> ssps = new ArrayList<>();
			for (StatisticScenarioPath ssp : gameMap.values()) {
				ssps.add(ssp);
			}
			ssps.addAll(completedGames);
			saver.SaveStatisticPath(ssps, desktopPath);
		} else {
			throw new GameAlreadyExistsException(
					"Neues Spiel kann nicht erstellt werden. Das Alte muss zunächst beendet werden.");
		}
	}

	public void updateCurrentGamePath(StatisticScenarioPath path)
			throws StatisticNotSavedException, GameDoesNotExistException {
		if (gameMap.containsKey(path.getUserID())) {
			if (gameMap.get(path.getUserID()).getGameID() == path.getGameID()) {
				System.out.println(path);
				gameMap.put(path.getUserID(), path);
				StatisticSaver saver = new StatisticSaver();
				List<StatisticScenarioPath> ssps = new ArrayList<>();
				for (StatisticScenarioPath ssp : gameMap.values()) {
					ssps.add(ssp);
				}
				ssps.addAll(completedGames);
				saver.SaveStatisticPath(ssps, desktopPath);
			} else {
				throw new GameDoesNotExistException(
						"Es existiert bereit ein Spiel mit einer anderen ID, das nicht beendet wurde. Das Alte muss zunächst beendet werden.");
			}
		} else {
			throw new GameDoesNotExistException(
					"Das spiel hat noch nicht angefangen und ist noch nicht erzeugt worden");
		}
		/*
		 * for (StatisticScenarioPath savedPath : gamelist) { if
		 * (savedPath.getGameID() == path.getGameID()) {
		 * gamelist.remove(savedPath); gamelist.addFirst(path); } }
		 */
	}

	public void completeCurrentGamePath(StatisticScenarioPath path) throws StatisticNotSavedException {
		if (gameMap.containsKey(path.getUserID())) {
			completedGames.add(path);
			gameMap.remove(path.getUserID());
			StatisticSaver saver = new StatisticSaver();
			List<StatisticScenarioPath> ssps = new ArrayList<>();
			for (StatisticScenarioPath ssp : gameMap.values()) {
				ssps.add(ssp);
			}
			ssps.addAll(completedGames);
			saver.SaveStatisticPath(ssps, desktopPath);
		}

	}

	/**
	 * erstellt die Userstatistic über alle SPiele eins SPielers, nach Scenario
	 * Sortiert
	 * 
	 * @param userId
	 * @param scenarioID
	 * @return
	 */
	private StatisticUserObject createUserStatistics(long userId, long scenarioID) {
		long playedTime = 0; // in Sekunden
		int visitedNodes = 0; // nur die maximale anzahl in einem Spiel
		int numberOfGames = 0;
		for (StatisticScenarioPath gamePath : completedGames) {
			if (gamePath.getUserID() == userId && gamePath.getScenarioID() == scenarioID) {
				playedTime += gamePath.getPlayedTime();
				numberOfGames++;
				if (visitedNodes < gamePath.getNumberOfVisitedNodes()) {
					visitedNodes = gamePath.getNumberOfVisitedNodes();
				}
			}
		}
		StatisticUserObject statistic = new StatisticUserObject(userId, scenarioID, playedTime, "s", visitedNodes,
				numberOfGames);
		return statistic;
	}

	private List<StatisticGameObject> createGamesStatistics(long userId) {
		LinkedList<StatisticGameObject> result = new LinkedList<StatisticGameObject>();
		for (StatisticScenarioPath gamePath : completedGames) {
			if (gamePath.getUserID() == userId) {
				result.add(new StatisticGameObject(userId, gamePath.getScenarioID(), gamePath.getGameID(),
						gamePath.getPlayedTime(), "s", gamePath.getNumberOfVisitedNodes()));
			}
		}
		return result;
	}

	@Override
	public String getStatistics(long userId) {
		String result = "[";
		for (StatisticGameObject obj : createGamesStatistics(userId)) {
			result += obj.toString() + ",";
		}
		char[] chars = result.toCharArray();
		if (chars[chars.length - 1] == ',') {
			chars[chars.length - 1] = ']';
			result = new String(chars);
		} else {
			result = new String(chars);
			result += "]";
		}
		return result;

	}

	@Override
	public String getStatistics() {
		// Für jeden user und für jedes Scenario das StatisticUserObject in die
		// liste packen
		List<StatisticUserObject> list = new LinkedList<StatisticUserObject>();
		List<Long> userIds = new LinkedList<Long>();
		for (StatisticScenarioPath path : completedGames) {
			if (!userIds.contains(path.getUserID())) {
				userIds.add(path.getUserID());
				list.add(createUserStatistics(path.getUserID(), 0));
				list.add(createUserStatistics(path.getUserID(), 0));
			}
		}
		// aus der liste einen String generieren
		String result = "[";
		for (StatisticUserObject obj : list) {
			result += obj.toString() + ",";
		}
		char[] chars = result.toCharArray();
		if (chars[chars.length - 1] == ',') {
			chars[chars.length - 1] = ']';
			result = new String(chars);
		} else {
			result = new String(chars);
			result += "]";
		}
		return result;
	}

	public StatisticScenarioPath getCurrentGame(long userID) throws GameDoesNotExistException {
		if (gameMap.containsKey(userID)) {
			return gameMap.get(userID);
		}
		throw new GameDoesNotExistException("Für den Spieler existiert kein laufendes Spiel");
	}

	@Override
	public boolean hasCurrentGame(long userID) {
		return gameMap.containsKey(userID);
	}
}
