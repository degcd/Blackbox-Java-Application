package interfaces;

public interface IGameplayManagement {

    public void receiveMsgFromClient(long answerID);
    public void startScenario(long scenarioID, long userID);
    
}
