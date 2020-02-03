package interfaces;

import entities.StatisticScenarioPath;
import exceptions.StatisticNotSavedException;

public interface IStatisticCalculator {
    public String getStatistics(long userId);
    public String getStatistics();
    public void createNewGamePath(StatisticScenarioPath path) throws StatisticNotSavedException;
    public void updateCurrentGamePath(StatisticScenarioPath path)throws  StatisticNotSavedException;
    public void completeCurrentGamePath(StatisticScenarioPath path) throws StatisticNotSavedException;
}
