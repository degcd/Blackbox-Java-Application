package interfaces;

import exceptions.NodeNotFoundException;

public interface IGameplayManagement {

    public boolean receiveMsgFromClient(long answerID, long userID);
    public boolean startScenario(long scenarioID, long userID);
    public boolean restartCurrentGame(long userID)throws NodeNotFoundException;
}
