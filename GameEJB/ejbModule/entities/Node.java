package entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Node<NodeMessage> {
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
        this.messageToClient = message;
        this.possibleAnswers = possibleAnswers;
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

}

