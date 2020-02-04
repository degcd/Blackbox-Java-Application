package persistency;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entities.StatisticScenarioPath;

/*
 * Class to save StatisticScenarioPath
 */
public class StatisticSaver {

	public static void SaveStatisticPath(List<StatisticScenarioPath> scenarioPaths, String filepath)
    {
		//create new file at saving location
        File f = new File(filepath);
        //create new wrapper object that will be serialized
        StatisticWrapper wrap =  new StatisticWrapper();
        wrap.setStatisticPaths(scenarioPaths);
        try
        {
        	//Serializing the wrapper class
            JAXBContext jaxbContext = JAXBContext.newInstance(StatisticWrapper.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(wrap, f);
        }
        catch(JAXBException e)
        {
            e.printStackTrace();
        }
    }

    public static List<StatisticScenarioPath> loadScenarioPaths(String filepath)
    {
    	//Creating list for loaded paths
        List<StatisticScenarioPath> sl = new ArrayList<>();
        File f = new File(filepath);
        JAXBContext jaxbContext;
        if(f.exists())
        {
        try
        {
        	//deserialzing the wrapper class
            jaxbContext = JAXBContext.newInstance(StatisticWrapper.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            StatisticWrapper sw = (StatisticWrapper) jaxbUnmarshaller.unmarshal(f);
            sl = sw.getStatisticPaths();
        }
        catch(JAXBException e)
        {
            e.printStackTrace();
        }
        }
        return sl;
    }
    
}
