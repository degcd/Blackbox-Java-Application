package beans;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Startup;

import entities.Answer;
import entities.Node;
import exceptions.NodeNotFoundException;
import interfaces.IPathCalculator;
@Startup
@Singleton
public class PathCalculatorBean implements IPathCalculator {
    ScenarioCreator scenarioCreator;
    List<Node> firstNodes;
    List<Node> nodeList;
    List<Answer> answerList;

    public PathCalculatorBean(){
    	try {
    	System.out.println("Start des PathCalculatorbean constructors");
        scenarioCreator=new ScenarioCreator();
        firstNodes=new ArrayList<Node>();
        firstNodes.add(scenarioCreator.getFirstNode(0));
        firstNodes.add(scenarioCreator.getFirstNode(1));
        nodeList=scenarioCreator.getNodeList();
        answerList=scenarioCreator.getAnswerList();
        
        
        System.out.println("PathCalculator Bean constructor");
    	}catch(Exception e) {
    		System.out.println("Fehler in PathCalculator Constructor");
    		e.printStackTrace();
    	}
    }


    @Override
    public Node getFollowingNode(long answerID) throws NodeNotFoundException {
    	for(Answer answer:answerList) {
    		System.out.println(answer);
    		if(answer.getAnswerID()==answerID) {
    			System.out.println("Node gefunden: "+answer.getAnswerNode());
    			return answer.getAnswerNode();
    		}
    	}
        throw new NodeNotFoundException("Wrong ID in PathCalculatorBean.getFollowingNode(answerID: "+answerID);
    }

    @Override
    public Node getNodeWithID(long searchNodeID) throws NodeNotFoundException {
    	for(Node node:nodeList) {
    		if(node.getNodeID()==searchNodeID) {
    			return node;
    		}
    	}
    	throw new NodeNotFoundException("Wrong ID in PathCalculatorBean.getNodeWithID(nodeID: "+searchNodeID);
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

