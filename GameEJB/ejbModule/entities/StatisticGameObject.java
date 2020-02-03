package entities;

public class StatisticGameObject {

	private long userID;
	private long playedTime;
	private String timeUnit;
	private int visitedNodes;
	private long scenarioID;
	private long gameID;
	
	public StatisticGameObject(){
		
	}
	
	/**
	 * @param userID
	 * @param scenarioID
	 * @param playedTime 
	 * @param timeUnit
	 * @param visitedNodes
	 * @param numberOfGames
	 */
	public StatisticGameObject(long userID, long scenarioID, long gameID,long playedTime, String timeUnit, int visitedNodes) {
		super();
		this.userID = userID;
		this.playedTime = playedTime;
		this.timeUnit = timeUnit;
		this.visitedNodes = visitedNodes;
		this.scenarioID=scenarioID;
		this.gameID=gameID;
	}
	
	
	public long getUserId() {
		return userID;
	}
	public void setUserId(long userId) {
		this.userID = userId;
	}
	public long getPlayedTime() {
		return playedTime;
	}
	public void setPlayedTime(long playedTime) {
		this.playedTime = playedTime;
	}
	public String getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}
	public int getVisitedNodes() {
		return visitedNodes;
	}
	public void setVisitedNodes(int visitedNodes) {
		this.visitedNodes = visitedNodes;
	}
	/**
	 * gibt das Objekt als Json-Objekt aus:
	 * {
	 * 		userID,
	 * 	gameID,
	 * 	scenarioID,
	 * 		played-time,
	 * 		timeunit,
	 * 		visited-nodes
	 * }
	 */
	  @Override
	    public String toString() {
	    	return "{\"userID\":\""+userID+"\",\"gameID\":\""+gameID+"\",\"scenarioID\":\""+scenarioID+"\",\"played-time\":\""+playedTime+"\",\"timeunit\":\""+timeUnit+"\",\"visited-nodes\":\""+visitedNodes+"\"}";
	    }
	
	
}
