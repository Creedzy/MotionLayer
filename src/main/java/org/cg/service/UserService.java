package org.cg.service;

import org.cg.Model.User;
import java.util.List;
public interface UserService  {

	public User addUser(User user);
    public User updateUser(Long userId, User user);
	public User getUser(Long userId);
	public List<User> getUsersById();
	public List<User> getAllUsers();
	public void deleteUser(Long UserId);
	
}
