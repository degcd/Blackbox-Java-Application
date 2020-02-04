package beans;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.ejb.Singleton;

import entities.Answer;
import interfaces.ICommunicationManagement;

@Singleton
public class CommunicationManagementBean implements ICommunicationManagement {

	// TODO Write-Lock einrichten
	Map<Long, LinkedList<String>> usermessages;
	LinkedList<String> topicMessages;

	public CommunicationManagementBean() {
		usermessages = (Map<Long, LinkedList<String>>) Collections
				.synchronizedMap(new HashMap<Long, LinkedList<String>>());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getNewMessages(long userID) {
		if (!usermessages.containsKey(userID)) {
			usermessages.put(userID, (LinkedList<String>) topicMessages.clone());
		}
		if (usermessages.containsKey(userID)) {
			List<String> result = (List<String>) usermessages.get(userID).clone();
			usermessages.get(userID).clear();
			return result;
		} else
			return (List<String>) topicMessages.clone();
	}

	@Override
	public void addToQueue(long userID, String msg) {
		if (!usermessages.containsKey(userID)) {
			usermessages.put(userID, new LinkedList<String>());
		}
		if (usermessages.containsKey(userID)) {
			usermessages.get(userID).add(msg);
		} else {
			System.err.println("not able to add to Queue");
		}
	}

	public String getJsonStringArrayFromList(List<Object> list) {
		String result = "[";
		for (Object obj : list) {
			result += obj.toString() + ",";
		}
		char[] chars = result.toCharArray();
		chars[chars.length - 1] = ']';
		result = new String(chars);
		return result;
	}
}
