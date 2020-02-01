package interfaces;

import entities.StatisticObject;
import entities.StatisticScenarioPath;
import exceptions.StatisticNotSavedException;

public interface IStatisticCalculator {
    public StatisticObject getStatistics(long userId);
    public void getStatistics();
    public void createNewGamePath(StatisticScenarioPath path) throws StatisticNotSavedException;
    public void updateCurrentGamePath(StatisticScenarioPath path)throws  StatisticNotSavedException;
    public void completeCurrentGamePath(StatisticScenarioPath path) throws StatisticNotSavedException;
}
