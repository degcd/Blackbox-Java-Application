package entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import exceptions.GameHasEndedException;

@Entity
public class StatisticScenarioPath {
    private static long gameIdCounter=0;
    @Id
    long gameID;
    @Column
    LinkedList<Long> path;
    @Column
    long userID;
    @Column
    Date beginDate;
    @Column
    Date endDate;
    @Column
    long scenarioID;
    @Column
    boolean hasEnded;

    public StatisticScenarioPath(long userID,long scenarioID){
        this.userID=userID;
        this.gameID = gameIdCounter++;
        this.beginDate=new Date();
        this.scenarioID=scenarioID;
        this.hasEnded=false;
    }

    public void add(Node currentNode) throws GameHasEndedException {
        if(!hasEnded){
            path.add(currentNode.getID());
        }
        else{
            throw new GameHasEndedException("Node kann nicht hinzugefügt werden. Spielt wurde bereits um "+endDate.toString()+" beendet!");
        }
    }

    public long getLastNodeID() {
        return path.getLast();
    }

    public long getUserID(){
        return userID;
    }

    /**
     * beendet die Möglichkeit weitere Knoten anzuhängen und speichert den Endzeitpunkt
     */
    public void endGame(){
        this.endDate=new Date();
        this.hasEnded=true;
    }

    /**
     * gibt die gespielte Zeit in Sekunden zurück
     * @return
     */
    public long getPlayedTime(){
        if(hasEnded){
            return (endDate.getTime()-beginDate.getTime())/1000;
        }
        else{
            return (new Date().getTime()-beginDate.getTime())/1000;
        }
    }

    public int getNumberOfVisitedNodes(){
        return path.size();
    }
    public List<Long> getPathList(){
    	return path;
    }
    public long getGameID(){
        return this.gameID;
    }
    public long getScenarioID() {
		return this.scenarioID;
	}

}

