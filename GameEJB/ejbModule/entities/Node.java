package entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Node {
    private static long nodeIdCounter = 0;
    @Id
    private long nodeID;
    @Column
    private LinkedList<NodeMessage> messageToClient;
    @Column
    private LinkedList<Answer> possibleAnswers;

    public Node(LinkedList<NodeMessage> message, LinkedList<Answer> possibleAnswers)
    {
        this.nodeID = nodeIdCounter++;
        this.messageToClient = copyMessageList(message);
        this.possibleAnswers = copyAnswerList(possibleAnswers);
    }
    
    private LinkedList<NodeMessage> copyMessageList(LinkedList<NodeMessage> messages){
    	LinkedList<NodeMessage> newList = new LinkedList<NodeMessage>();
    	for(NodeMessage m : messages){
    		NodeMessage nm = new NodeMessage(m.getMessgetype(), m.getMessageString(), m.getTimeout(), m.getSender());
    		newList.add(nm);
    	}
    	return newList;
    }
    
    private LinkedList<Answer> copyAnswerList(LinkedList<Answer> answers){
    	LinkedList<Answer> newList = new LinkedList<Answer>();
    	for(Answer a : answers){
    		Answer answer = new Answer(a.getAnswerMessage(), a.getAnswerNode());
    		newList.add(a);
    	}
    	return newList;
    }

    public Long getID() {
        return nodeID;
    }

    /**
     * Prüft, ob der Knoten ein Endknoten ist, also keine Antworten mehr hat
     * @return
     */
    public boolean isEnd() {
        if(possibleAnswers.size()==0){
            return true;
        }
        return false;
    }

    public List<Answer> getAnswerList() {
        return possibleAnswers;
    }

    public List<NodeMessage> getMessageToClientList() {
        return messageToClient;
    }

	public long getNodeID() {
		return nodeID;
	}

	public void setNodeID(long nodeID) {
		this.nodeID = nodeID;
	}

	public LinkedList<NodeMessage> getMessageToClient() {
		return messageToClient;
	}

	public void setMessageToClient(LinkedList<NodeMessage> messageToClient) {
		this.messageToClient = messageToClient;
	}

	public LinkedList<Answer> getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(LinkedList<Answer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}
	@Override
    public String toString() {
		return "{\"nodeID\":\""+nodeID+"\",\"anzahl der Messages\":\""+this.messageToClient.size()+"\",\"Anzahl der Antworten\":\""+this.possibleAnswers.size()+"\"}";
	    
    }

    
    

}

