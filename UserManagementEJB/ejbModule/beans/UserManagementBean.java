package beans;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import entities.User;
import interfaces.IUserManagement;

@Singleton
public class UserManagementBean implements IUserManagement {

    private Map<Long, User> allUsers;
    private long lastUserId = 0;

    @PostConstruct
    private void init() {
        allUsers = new LinkedHashMap<Long, User>();
    }




    //REMOTE

    public long register(String email, String password) {
        if(email == null) {
            throw new IllegalArgumentException("Email cannot be null.");
        }
        if(password == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }
        for (User user: allUsers.values()) { //check if email is already taken by another user
            if (user.email().equals(email)) {
                throw new IllegalArgumentException("Email exists already.");
            }
        }
        return createUser(email, password);
    }


    public boolean changePassword(String email, String oldPW, String newPW) {
        User currentUser = getUserByName(email);
        assert currentUser != null;
        long key = currentUser.userID();
        if (checkCredentials(currentUser.email(), oldPW)){
            currentUser.setPassword(newPW);
            update(key, currentUser);
            return true; //password-change success
        }
        return false; //password-change fail
    }


    public boolean logIn(String email, String password) {
        if(checkCredentials(email, password)) {
            User current = getUserByName(email);
            assert current != null;
            current.setOnline(true);
            return true; //log-in success
        }
        return false; //log-in fail
    }


    public boolean logOut(String email) {
        User current = getUserByName(email);
        if (current != null) {
            current.setOnline(false);
            return true; //log-out success
        }
        return false; //log-out fail
    }




    //UserManagement

    public List<User> readUsers() {
        return new ArrayList<User>(allUsers.values());
    }


    public Long createUser(String email, String password) {
        User newOne = new User(email, password);
        allUsers.put(lastUserId, newOne);
        lastUserId++;
        return newOne.userID();
    }


    public void update(long key, User user) {
        User current = getUserById(key);
        assert current != null;
        current.setEmail(user.email());
        current.setPassword(user.password());
        current.setOnline(user.online());
        allUsers.put(key, user); //braucht man das??
    }


    public void deleteUser(String email) {
        for (User user: allUsers.values()) {
            if (user.email().equals(email)) {
                allUsers.remove(user.userID());
            }
        }
    }




    //PRIVATE METHODS
    private User getUserByName(String email) {
        for (User user: allUsers.values()) {
            if (user.email().equals(email)) {
                return user;
            }
        }
        return null;
    }

    private User getUserById(long id) {
        for (User user: allUsers.values()) {
            if (user.userID() == id) {
                return user;
            }
        }
        return null;
    }

    private boolean checkCredentials(String email, String password) {
        User user = getUserByName(email);
        assert user != null;
        return user.password().equals(password);
    }
}