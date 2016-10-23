package org.cg.service;

import java.util.List;

import org.cg.Model.dto.UserDTO;

public interface RequestService {
	
	
	public UserDTO addUser(UserDTO user);
    public UserDTO updateUser(Long userId, UserDTO user);
	public UserDTO getUser(Long userId);
	public List<UserDTO> getUsersById();
	public List<UserDTO> getAllUsers();
	public void deleteUser(Long UserId);
	
}
