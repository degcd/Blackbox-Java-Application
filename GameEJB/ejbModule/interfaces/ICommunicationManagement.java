package interfaces;

import java.util.List;

public interface ICommunicationManagement {

	List<String> getNewMessages(long userID);
	
	void addToQueue(long userID, String msg);

	String getJsonStringArrayFromList(List<Object> list);
}
