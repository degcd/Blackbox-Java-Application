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

	/**
	 * Initialisierung der Bean
	 */
    @PostConstruct
    private void init() {
        allUsers = new LinkedHashMap<Long, User>();
    }



    //REMOTE

	/**
	 * Nach Aufruf der Registrierung vom Client aus, wird ein neuer User angelegt und und der Map hinzugefügt
	 * 
	 * @param email
	 * @param password
	 * 
	 * @return userId
	 */
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


	/**
	 * Wenn beim Client das Passwort geändert werden soll, wird dies für den entsprechenden User ausgeführt
	 * 
	 * @param email
	 * @param oldPW
	 * @param newPW
	 * 
	 * @return boolean
	 */
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


	/**
	 * Beim Client möchte sich ein Benutzer einloggen.
	 * 
	 * @param email
	 * @param password
	 * 
	 * @return boolean
	 */
    public boolean logIn(String email, String password) {
        if(checkCredentials(email, password)) {
            User current = getUserByName(email);
            assert current != null;
            current.setOnline(true);
            return true; //log-in success
        }
        return false; //log-in fail
    }


	/**
	 * Beim Client möchte sich ein Benutzer ausloggen.
	 * 
	 * @param email
	 * 
	 * @return boolean
	 */
    public boolean logOut(String email) {
        User current = getUserByName(email);
        if (current != null) {
            current.setOnline(false);
            return true; //log-out success
        }
        return false; //log-out fail
    }




    //UserManagement

	/**
	 * Methode liefert alle registrierten User zurück.
	 * 
	 * @return List<User>
	 */
    public List<User> readUsers() {
        return new ArrayList<User>(allUsers.values());
    }


	/**
	 * Legt intern den User an, der für die Registrierung vom Client gebraucht wird.
	 * 
	 * @param email
	 * @param password
	 * 
	 * @return userId
	 */
    public Long createUser(String email, String password) {
        User newOne = new User(email, password);
        allUsers.put(lastUserId, newOne);
        lastUserId++;
        return newOne.userID();
    }


	/**
	 * Setzt alle Attribute eines Users neu, abgesehen von der userId
	 * 
	 * @param key
	 * @param user
	 */
    public void update(long key, User user) {
        User current = getUserById(key);
        assert current != null;
        current.setEmail(user.email());
        current.setPassword(user.password());
        current.setOnline(user.online());
        allUsers.put(key, user);
    }

	/**
	 * Löscht einen User aus der Map.
	 * 
	 * @param email
	 */
    public void deleteUser(String email) {
        for (User user: allUsers.values()) {
            if (user.email().equals(email)) {
                allUsers.remove(user.userID());
            }
        }
    }




    //PRIVATE METHODS
    
	/**
	 * Ermittelt User anhand einer gegebenen email.
	 * 
	 * @param email
	 * 
	 * @return user
	 */
    private User getUserByName(String email) {
        for (User user: allUsers.values()) {
            if (user.email().equals(email)) {
                return user;
            }
        }
        return null;
    }
    
	/**
	 * Ermittelt User anhand einer gegebenen userId.
	 * 
	 * @param userId
	 * 
	 * @return user
	 */
    private User getUserById(long id) {
        for (User user: allUsers.values()) {
            if (user.userID() == id) {
                return user;
            }
        }
        return null;
    }

	/**
	 * Überprüft Übereinstimmung von email und password für einen User.
	 * 
	 * @param email
	 * @param password
	 * 
	 * @return boolean
	 */
    private boolean checkCredentials(String email, String password) {
        User user = getUserByName(email);
        assert user != null;
        return user.password().equals(password);
    }
}