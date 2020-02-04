package interfaces;

import entities.Node;
import exceptions.NodeNotFoundException;

public interface IPathCalculator {
    Node getFollowingNode(long answerID) throws NodeNotFoundException;
    Node getNodeWithID(long searchNodeID) throws NodeNotFoundException;
    Node getStartNodeOfScenario(long scenarioID) throws NodeNotFoundException;
}
