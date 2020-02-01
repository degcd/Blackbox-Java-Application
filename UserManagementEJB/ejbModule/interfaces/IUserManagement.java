package interfaces;

import java.util.List;

import entities.User;

public interface IUserManagement {

    public Long createUser(String email, String password);
    public void deleteUser(String email);
    public void update(long key, User user);
    public List<User> readUsers();
    public long register(String email, String password);
    public boolean changePassword(String email, String oldPW, String newPW);
    public boolean logIn(String email, String password);
    public boolean logOut(String email);
    
}
