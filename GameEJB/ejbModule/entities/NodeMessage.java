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

    public long getNodeMessageID() {
		return nodeMessageID;
	}

	public void setNodeMessageID(long nodeMessageID) {
		this.nodeMessageID = nodeMessageID;
	}

	public Messagetype getType() {
		return type;
	}

	public void setType(Messagetype type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getTimeout() {
        return getTimeout();
    }
    /**
     * gibt das Objekt als Json-Objekt-String aus
     * {
     * 		nodeMessageID,
     * 		messagetype,
     * 		sender,
     * 		message,
     * }	
     */
    @Override
    public String toString() {
    	return "{\"nodeMessageID\":"+nodeMessageID+",\"messagetype\":\""+type.name()+"\",\"sender\":\""+sender+"\",\"message\":\""+message+"\"}";
    }
}
