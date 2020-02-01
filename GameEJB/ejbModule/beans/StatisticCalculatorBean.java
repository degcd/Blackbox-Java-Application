package beans;

import java.util.LinkedList;

import javax.ejb.Stateless;

import entities.StatisticObject;
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

    public StatisticObject getStatistics(long userId) {
        long playedTime=0; //in Sekunden
        int visitedNodes=0; //nur die maximale anzahl in einem Spiel
        int numberOfGames=0;
        for(StatisticScenarioPath gamePath:gamelist){
            if(gamePath.getUserID()==userId){
                playedTime+=gamePath.getPlayedTime();
                numberOfGames++;
                if(visitedNodes<gamePath.getNumberOfVisitedNodes()){
                    visitedNodes=gamePath.getNumberOfVisitedNodes();
                }
            }
        }
        StatisticObject statistic = new StatisticObject(userId, playedTime, "s", visitedNodes, numberOfGames);
        return statistic;
    }
    public void getStatistics() {

    }

}

