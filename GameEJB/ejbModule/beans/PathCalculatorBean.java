package beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import entities.Answer;
import entities.Node;
import exceptions.NodeNotFoundException;
import interfaces.IPathCalculator;

@Singleton
public class PathCalculatorBean implements IPathCalculator {
    ScenarioCreator scenarioCreator;
    List<Node> firstNodes;

    public PathCalculatorBean(){
    	try {
    	System.out.println("Start des PathCalculatorbean construkors");
        scenarioCreator=new ScenarioCreator();
        firstNodes=new ArrayList<Node>();
        firstNodes.add(scenarioCreator.getFirstNode(0));
        firstNodes.add(scenarioCreator.getFirstNode(1));
        System.out.println("PathCalculator BEan construkor");
    	}catch(Exception e) {
    		System.out.println("Fehler in PathCalculator Construktor");
    		e.printStackTrace();
    	}
    }

/*
   @PostConstruct
   private void init(){

   }
*/
    @Override
    public Node getFollowingNode( long lastNodeID, long answerID) throws NodeNotFoundException {
        Node lastNode=getNodeWithID(lastNodeID);
        List<Answer> answers=lastNode.getAnswerList();
        for(Answer i:answers){
            if(i.getAnswerID() == answerID){
                return i.getAnswerNode();
            }
        }
        throw new NodeNotFoundException("Wrong ID in PathCalculatorBean.getFollowingNode(lastNodeID: "+lastNodeID+", answerID: "+answerID);
    }

    @Override
    public Node getNodeWithID(long searchNodeID) throws NodeNotFoundException {
        Node searchScenario0=searchChilrden(firstNodes.get(0), searchNodeID);
        if(searchScenario0!=null) return searchScenario0;
        return searchChilrden(firstNodes.get(1),searchNodeID);

    }
    public Node getNodeWithID(long searchNodeID,long scenarioID) throws NodeNotFoundException {
        return searchChilrden(firstNodes.get((int) scenarioID),searchNodeID);
    }
    private Node searchChilrden(Node parentNode, long searchNodeID)  throws NodeNotFoundException{
        List<Answer> answers=parentNode.getAnswerList();
        for (Answer i: answers) {
            if(i.getAnswerNode().getID().equals(searchNodeID)) {
                return i.getAnswerNode();
            }
            if(!i.getAnswerNode().isEnd()){
                Node searchNode=searchChilrden(i.getAnswerNode(),searchNodeID);
                if(searchNode!=null)return searchNode;
            }
        }
        throw new NodeNotFoundException(searchNodeID+ "not in parentNode found");
    }

    @Override
    public Node getStartNodeOfScenario(long scenarioID) throws NodeNotFoundException{
    	System.out.println("PathCalculator getStartNode of Scenario: "+scenarioID); 
    	if(firstNodes.size()>scenarioID) {
    		if(firstNodes.get((int) scenarioID)==null) {
    			throw new NodeNotFoundException("Erstes Node ist nicht verfügbar.");
    		}
    		return firstNodes.get((int) scenarioID);
    	}
        	throw new NodeNotFoundException("ScenarioID "+scenarioID+" ist nicht verfügbar.");
    }

}

