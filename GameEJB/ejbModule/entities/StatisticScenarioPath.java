package entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import exceptions.GameHasEndedException;
import exceptions.NodeNotFoundException;

//@Entity
public class StatisticScenarioPath {
    private static long gameIdCounter=0;
//    @Id
    long gameID;
    LinkedList<Long> path;
    long lastAnswerID;
//    @Column
    long userID;
//    @Column
    Date beginDate;
//    @Column
    Date endDate;
//    @Column
    long scenarioID;
//    @Column
    boolean hasEnded;
    
    public StatisticScenarioPath()
    {
    	path = new LinkedList<>();
    }
    

    public StatisticScenarioPath(long userID,long scenarioID){
        this.userID=userID;
        this.gameID = gameIdCounter++;
        this.beginDate=new Date();
        this.scenarioID=scenarioID;
        this.hasEnded=false;
        path=new LinkedList<Long>();

    }

    public void add(Node currentNode) throws GameHasEndedException, NodeNotFoundException {
        if(!hasEnded){
        	if(currentNode!=null) {
            path.add(currentNode.getID());
        	}
        	else {
        		throw new NodeNotFoundException("es wurde null als Node �bergeben");
        	}
        }
        else{
            throw new GameHasEndedException("Node kann nicht hinzugef�gt werden. Spiel wurde bereits um "+endDate.toString()+" beendet!");
        }
    }

    public long getLastNodeID() {
        return path.getLast();
    }

    public long getUserID(){
        return userID;
    }

    /**
     * beendet die M�glichkeit weitere Knoten anzuh�ngen und speichert den Endzeitpunkt
     */
    public void endGame(){
        this.endDate=new Date();
        this.hasEnded=true;
    }

    /**
     * gibt die gespielte Zeit in Sekunden zur�ck
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

	public LinkedList<Long> getPath() {
		return path;
	}

	public void setPath(LinkedList<Long> path) {
		this.path = path;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isHasEnded() {
		return hasEnded;
	}

	public void setHasEnded(boolean hasEnded) {
		this.hasEnded = hasEnded;
	}

	public void setGameID(long gameID) {
		this.gameID = gameID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public void setScenarioID(long scenarioID) {
		this.scenarioID = scenarioID;
	}
	
	
	
	public long getLastAnswerID() {
		return lastAnswerID;
	}


	public void setLastAnswerID(long lastAnswerID) {
		this.lastAnswerID = lastAnswerID;
	}


	@Override
	 public String toString() {
		return "{\"gameID\":"+gameID+",\"userID\":"+userID+",\"Anzahl der Nodes\":"+path.size()+"}";
	    
    }

}

