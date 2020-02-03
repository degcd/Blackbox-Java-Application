package entities;

public class StatisticUserObject {
	private long userID;
	private long playedTime;
	private String timeUnit;
	private int visitedNodes;
	private int numberOfGames;
	private long scenarioID;
	
	public StatisticUserObject(){
		
	}
	
	/**
	 * @param userID
	 * @param playedTime
	 * @param playedTime 
	 * @param timeUnit
	 * @param visitedNodes
	 * @param numberOfGames
	 */
	public StatisticUserObject(long userID, long scenarioID, long playedTime, String timeUnit, int visitedNodes, int numberOfGames) {
		super();
		this.userID = userID;
		this.playedTime = playedTime;
		this.timeUnit = timeUnit;
		this.visitedNodes = visitedNodes;
		this.numberOfGames = numberOfGames;
		this.scenarioID=scenarioID;
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
	public int getNumberOfGames() {
		return numberOfGames;
	}
	public void setNumberOfGames(int numberOfGames) {
		this.numberOfGames = numberOfGames;
	}
	/**
	 * gibt das Objekt als Json-Objekt aus:
	 * {
	 * 		userID,
	 * 		scenarioID,
	 * 		played-time,
	 * 		timeunit,
	 * 		visited-nodes,
	 * 		number-of-games
	 * }
	 */
	  @Override
	    public String toString() {
	    	return "{\"userID\":\""+userID+"\",\"scenarioID\":\""+scenarioID+"\",\"played-time\":\""+playedTime+"\",\"timeunit\":\""+timeUnit+"\",\"visited-nodes\":\""+visitedNodes+"\",\"number-of-games\":\""+numberOfGames+"\"}";
	  }
}
