package entities;

public class StatisticObject {

	private long userId;
	private long playedTime;
	private String timeUnit;
	private int visitedNodes;
	private int numberOfGames;
	
	public StatisticObject(){
		
	}
	
	/**
	 * @param userId
	 * @param playedTime
	 * @param timeUnit
	 * @param visitedNodes
	 * @param numberOfGames
	 */
	public StatisticObject(long userId, long playedTime, String timeUnit, int visitedNodes, int numberOfGames) {
		super();
		this.userId = userId;
		this.playedTime = playedTime;
		this.timeUnit = timeUnit;
		this.visitedNodes = visitedNodes;
		this.numberOfGames = numberOfGames;
	}
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
	
	
	
}
