package persistency;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import entities.StatisticScenarioPath;

@XmlRootElement(name = "Statisticlist")
public class StatisticWrapper {

    
    private List<StatisticScenarioPath> scenarioList;

    public StatisticWrapper()
    {
        scenarioList = new ArrayList<StatisticScenarioPath>();
    }
    public List<StatisticScenarioPath> getStatisticPaths()
    {
        return  scenarioList;
    }

    public void setStatisticPaths(List<StatisticScenarioPath> paths)
    {
        scenarioList = paths;
    }
}