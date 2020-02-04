package persistency;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import entities.User;
/*
 * Wrapper Class to serialize all user objects
 */
@XmlRootElement(name = "Userlist")
public class UserWrapper {

    //@XmlElement(name="User")
    private List<User> userList;

    public UserWrapper()
    {
        userList = new ArrayList<User>();
    }
    public List<User> getUser()
    {
        return  userList;
    }

    public void setUser(List<User> users)
    {
        userList = users;
    }
}
