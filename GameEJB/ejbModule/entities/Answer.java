package entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class Answer{
    private static long answerIdCounter = 0;
    @Id
    private long answerID;
    @Column
    private String answerMessage;
    @Column
    private Node answerNode;

    public Answer(String answerMessage, Node answerNode)
    {
        this.answerID = answerIdCounter++;
        this.answerMessage = answerMessage;
        this.answerNode = answerNode;
    }
    public long getAnswerID() {
        return answerID;
    }

    public boolean hasMessage(String pMsg) {
        return answerMessage.equals(pMsg);
    }

    public Node getAnswerNode(){
        return answerNode;
    }
    /**
     * gibt das Objekt als Json-Objekt-String aus
     * 	{
     * 		answerID,
     * 		answerMessage
     * 	}
     */
    @Override
    public String toString() {
    	return "{\"answerID\":\""+answerID+"\",\"answerMessage\":\""+answerMessage+"\"}";
    }
    public long getNodeID() {
    	return answerNode.getID();
    }
	public String getAnswerMessage() {
		return answerMessage;
	}
	public void setAnswerMessage(String answerMessage) {
		this.answerMessage = answerMessage;
	}
	public void setAnswerID(long answerID) {
		this.answerID = answerID;
	}
	public void setAnswerNode(Node answerNode) {
		this.answerNode = answerNode;
	}
    

}
