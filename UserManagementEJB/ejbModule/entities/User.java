package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import entityListeners.UserPersistencyLog;

@Entity
@EntityListeners(UserPersistencyLog.class)
public class User {

    private static long userIdCounter = 0;
    @Id
    private long userID;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private boolean online;

    public User(String email, String password) {
        this.userID = userIdCounter++;
        this.email = email;
        this.password = password;
        this.online = true;
    }

    public long userID() {
        return userID;
    }

    public String email() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String password() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean online() {
        return online;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }
    
    @Override
    public String toString(){
    	return "{\"userID\":\""+userID+"\",\"username\":\""+username+"\",\"email\":\""+email+"\",\"password\":\""+password+"\",\"online\":\""+online+"\"}"; 
    }
}