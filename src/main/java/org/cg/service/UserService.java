package org.cg.service;

import org.cg.Model.User;
import java.util.List;
public interface UserService  {

	public UserDTO addUser(UserDTO user);
    public UserDTO updateUser(Long userId, UserDTO user);
	public UserDTO getUser(Long userId);
	public List<UserDTO> getUsersById();
	public List<UserDTO> getAllUsers();
	public void deleteUser(Long UserId);
	
}
