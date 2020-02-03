package beans;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;

import entities.StatisticGameObject;
import entities.StatisticUserObject;
import entities.StatisticScenarioPath;
import exceptions.StatisticNotSavedException;
import interfaces.IStatisticCalculator;

@Stateless
public class StatisticCalculatorBean implements IStatisticCalculator{
LinkedList<StatisticScenarioPath> gamelist;
    public StatisticCalculatorBean(){
        gamelist=new LinkedList<StatisticScenarioPath>();
    }

//TODO Datenbankanbindung
    public void createNewGamePath(StatisticScenarioPath path)throws StatisticNotSavedException{
        gamelist.addFirst(path);
    }
    public void updateCurrentGamePath(StatisticScenarioPath path) throws StatisticNotSavedException {
        for(StatisticScenarioPath savedPath:gamelist){
            if(savedPath.getGameID()==path.getGameID()){
                gamelist.remove(savedPath);
                gamelist.addFirst(path);
            }
        }
    }

    public void completeCurrentGamePath(StatisticScenarioPath path) throws StatisticNotSavedException {
        for(StatisticScenarioPath savedPath:gamelist){
            if(savedPath.getGameID()==path.getGameID()){
                gamelist.remove(savedPath);
                gamelist.add(path);
            }
        }
        if(!gamelist.contains(path))gamelist.add(path);
    }

    /**erstellt die Userstatistic über alle SPiele eins SPielers, nach Scenario Sortiert
     * 
     * @param userId
     * @param scenarioID
     * @return
     */
    private StatisticUserObject createUserStatistics(long userId, long scenarioID) {
        long playedTime=0; //in Sekunden
        int visitedNodes=0; //nur die maximale anzahl in einem Spiel
        int numberOfGames=0;
        for(StatisticScenarioPath gamePath:gamelist){
            if(gamePath.getUserID()==userId&& gamePath.getScenarioID()==scenarioID){
                playedTime+=gamePath.getPlayedTime();
                numberOfGames++;
                if(visitedNodes<gamePath.getNumberOfVisitedNodes()){
                    visitedNodes=gamePath.getNumberOfVisitedNodes();
                }
            }
        }
        StatisticUserObject statistic = new StatisticUserObject(userId,scenarioID, playedTime, "s", visitedNodes, numberOfGames);
        return statistic;
    }
    private	List<StatisticGameObject> createGamesStatistics(long userId, long scenarioId){
    	LinkedList<StatisticGameObject> result=new LinkedList<StatisticGameObject>();
    	for(StatisticScenarioPath gamePath: gamelist) {
    		if(gamePath.getUserID()==userId&&gamePath.getScenarioID()==scenarioId) {
    			result.add(new StatisticGameObject(userId,scenarioId,gamePath.getGameID(),gamePath.getPlayedTime(),"s",gamePath.getNumberOfVisitedNodes()));
    		}
    	}
    	return result;
    }
    
    @Override
	public String getStatistics(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStatistics() {
		// TODO Auto-generated method stub
		return null;
	}


}

