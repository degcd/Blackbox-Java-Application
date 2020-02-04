package beans;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

import entities.Answer;
import entities.Messagetype;
import entities.Node;
import entities.NodeMessage;
import entities.StatisticScenarioPath;
import exceptions.GameAlreadyExistsException;
import exceptions.GameDoesNotExistException;
import exceptions.GameHasEndedException;
import exceptions.NodeNotFoundException;
import exceptions.StatisticNotSavedException;
import interfaces.ICommunicationManagement;
import interfaces.IGameplayManagement;
import interfaces.IPathCalculator;
import interfaces.IStatisticCalculator;

@Stateless
public class GameplayManagementBean implements IGameplayManagement {
	@EJB
	private IPathCalculator pathCalculator;
	@EJB
	private IStatisticCalculator statisticCalculator;
	@EJB
	private ICommunicationManagement communicationManager;

	long userID;

	public GameplayManagementBean() {

	}

	@Resource
	private TimerService timerService;

	/**
	 * startet das übergebene Szenario, und führt
	 * 
	 * @param scenarioID
	 *            Szenarioauswahl (0 oder 1)
	 * @param userID
	 *            ID des Nutzers
	 */
	@Override
	public boolean startScenario(long scenarioID, long userID) {
		System.out.println("Scenario startet mit scenario: " + scenarioID + " und user: " + userID);
		StatisticScenarioPath currentPath = new StatisticScenarioPath(userID, scenarioID);
		this.userID = userID;
		try {
			Node currentNode = pathCalculator.getStartNodeOfScenario(scenarioID);
			currentPath.add(currentNode);
			statisticCalculator.createNewGamePath(currentPath);
			System.out.println(currentNode.toString());
			analyseNode(currentNode, currentPath);
		} catch (NodeNotFoundException | GameHasEndedException | StatisticNotSavedException | GameAlreadyExistsException
				| GameDoesNotExistException e) {
			e.printStackTrace();
			sendMsgToClient(new NodeMessage(Messagetype.Servermessage,
					"Scenario konnte nicht ausgewählt werden. Bitte kontaktiere Support.", 0, "Server"));
			return false;
		}
		return true;

	}

	/**
	 * Ermittelt anhand der übergebenen Antwort den nachfolgenden Pfad
	 * 
	 * @param answerID
	 */
	@Override
	public boolean receiveMsgFromClient(long answerID, long userID) {
		try {
			StatisticScenarioPath currentPath = statisticCalculator.getCurrentGame(userID);
			long lastNode = currentPath.getLastNodeID();
			Node currentNode = pathCalculator.getFollowingNode(answerID);
			System.out.println(currentNode);
			currentPath.add(currentNode);
			analyseNode(currentNode, currentPath);
		} catch (NodeNotFoundException | GameHasEndedException | StatisticNotSavedException
				| GameDoesNotExistException e) {
			// e.printStackTrace();
			sendMsgToClient(new NodeMessage(Messagetype.Servermessage,
					"Antwort konnte nicht verarbeitet werden. Bitte kontaktiere Support.", 0, "Server"));
			return false;
		}
		return true;
	}

	/**
	 * Überpüft den Knoten auf Endknoten, speichert den aktuellen Gamepath in
	 * der Statistik, und leitet die Nachrichten und Antworten weiter
	 * 
	 * @param currentNode
	 * @throws GameDoesNotExistException
	 * @throws GameAlreadyExistsException
	 */
	private void analyseNode(Node currentNode, StatisticScenarioPath currentPath)
			throws StatisticNotSavedException, GameDoesNotExistException {
		if (currentNode.isEnd()) {
			statisticCalculator.completeCurrentGamePath(currentPath);
			sendMsgToClient(new NodeMessage(Messagetype.Servermessage, "Ende erreicht", 0, "Server"));
		} else {
			// Fehler, der das Spiel nicht weiter beeinträchtigt
			try {
				statisticCalculator.updateCurrentGamePath(currentPath);
			} catch (StatisticNotSavedException e) {
				System.out.println(e.getMessage());
			}
			List<NodeMessage> messageList = currentNode.getMessageToClientList();
			for (NodeMessage msg : messageList) {
				TimerConfig timerConfig = new TimerConfig();
				timerConfig.setInfo(msg);
				timerConfig.setPersistent(false);
				timerService.createSingleActionTimer((long) msg.getTimeout(), timerConfig);
			}
			sendAnswersToClient(currentNode.getAnswerList());
		}
	}

	/**
	 * Sendet eine NodeMsg an den Client
	 * 
	 * @param nodeMsg
	 */
	private void sendMsgToClient(NodeMessage nodeMsg) {
		communicationManager.addToQueue(userID, "{\"answertype\":\"NodeMessage\",\"msg\":" + nodeMsg.toString() + "}");
	}

	/**
	 * Sendet die Antwortliste zur Auswahl an den Client
	 * 
	 * @param answerList
	 */
	private void sendAnswersToClient(List<Answer> answerList) {
		String msg = "[";
		for (Answer answer : answerList) {
			msg += answer.toString() + ",";
		}
		char[] chars = msg.toCharArray();
		if (chars[chars.length - 1] == ',') {
			chars[chars.length - 1] = ']';
			msg = new String(chars);
		} else {
			msg = new String(chars);
			msg += "]";
		}
		communicationManager.addToQueue(userID, "{\"answertype\":\"AnswerList\",\"msg\":" + msg + "}");
	}

	public boolean restartCurrentGame(long userID) throws NodeNotFoundException {
		if (!statisticCalculator.hasCurrentGame(userID)) {
			return false;
		}
		try {
			StatisticScenarioPath currentPath = statisticCalculator.getCurrentGame(userID);

			List<Answer> currentAnswerList = new LinkedList<Answer>();
			List<Long> pathList = currentPath.getPathList();
			for (long nodeID : pathList) {
				for (Answer answer : currentAnswerList) {
					if (answer.getNodeID() == nodeID) {
						List<Answer> answerlist = new LinkedList<Answer>();
						sendAnswersToClient(answerlist);
					}
				}
				Node node = pathCalculator.getNodeWithID(nodeID);
				List<NodeMessage> msgList = node.getMessageToClientList();
				for (NodeMessage msg : msgList) {
					sendMsgToClient(msg);
				}
				currentAnswerList = node.getAnswerList();

			}
			sendAnswersToClient(currentAnswerList);
			return true;
		} catch (GameDoesNotExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * sendet nach einem timeout die NodeMsg an den Client
	 * 
	 * @param timer
	 */
	@Timeout
	public void timeout(Timer timer) {
		try {
			NodeMessage msg = (NodeMessage) timer.getInfo();
			sendMsgToClient(msg);
		} catch (Exception e) {
			System.err.println("Unecpected Parsing Error. Msg could not be send.");
			System.out.println(e.toString());
		}

	}

}
