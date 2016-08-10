package org.cg.service;

import org.cg.Model.User;
import java.util.List;
public interface UserService  {

	public User addUser(User user);
    public User updateUser(String userId, User user);
	public User getUser(String userId);
	public List<User> getUsersById();
	public List<User> getAllUsers();
	public void deleteUser(String UserId);
	
}
