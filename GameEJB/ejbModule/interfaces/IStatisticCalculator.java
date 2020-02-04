package interfaces;

import entities.StatisticScenarioPath;
import exceptions.GameAlreadyExistsException;
import exceptions.GameDoesNotExistException;
import exceptions.StatisticNotSavedException;

public interface IStatisticCalculator {
    public String getStatistics(long userId);
    public String getStatistics();
    public void createNewGamePath(StatisticScenarioPath path) throws StatisticNotSavedException, GameAlreadyExistsException;
    public void updateCurrentGamePath(StatisticScenarioPath path)throws  StatisticNotSavedException, GameDoesNotExistException;
    public void completeCurrentGamePath(StatisticScenarioPath path) throws StatisticNotSavedException;
    public StatisticScenarioPath getCurrentGame(long userID) throws GameDoesNotExistException;
	public boolean hasCurrentGame(long userID);
}
