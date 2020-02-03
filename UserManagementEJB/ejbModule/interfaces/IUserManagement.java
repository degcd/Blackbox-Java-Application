package interfaces;

import entities.User;

public interface IUserManagement {

    public User register(String email, String password, String username);
    public boolean changePassword(String email, String oldPW, String newPW);
    public User logIn(String email, String password);
    public boolean logOut(String email);
    
}
