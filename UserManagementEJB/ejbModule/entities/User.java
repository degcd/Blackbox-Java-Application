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

    public User(){}

    public User(String email, String password, String username) {
        this.userID = userIdCounter++;
        this.email = email;
        this.password = password;
        this.username = username;
    }



	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
    public String toString(){
    	return "{\"userID\":\""+userID+"\",\"username\":\""+username+"\",\"email\":\""+email+"\",\"password\":\""+password+"\"}"; 
    }
}