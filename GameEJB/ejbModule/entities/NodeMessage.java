package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NodeMessage implements Serializable {
    private static long nodeMessageIdCounter = 0;
    @Id
    private long nodeMessageID;
    @Column
    private Messagetype type;
    @Column
    private String message;
    @Column
    private int timeout;
    @Column
    private String sender;

    public NodeMessage(Messagetype type, String message, int timeout, String sender)
    {
        this.nodeMessageID = nodeMessageIdCounter++;
        this.type = type;
        this.message = message;
        this.timeout = timeout;
        this.sender = sender;
    }

    public NodeMessage(Messagetype type, String message, String sender)
    {
        this.nodeMessageID = nodeMessageIdCounter++;
        this.type = type;
        this.message = message;
        this.sender = sender;
        this.timeout = 0;
    }
    public Messagetype getMessgetype() {
        return type;
    }

    public String getMessageString() {
        return message;
    }

    public void startTimeout() {
        Date endDate=new Date(new Date().getTime()+timeout);
        while(new Date().before(endDate)){
        }
        return;
    }

    public int getTimeout() {
        return getTimeout();
    }
}
