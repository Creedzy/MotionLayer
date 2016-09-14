package org.cg.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.cg.Model.User;
import org.cg.Model.dto.UserDTO;
import org.cg.service;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.cg.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceDAO implements UserService{
ObjectMapper mapper = new ObjectMapper();

@Autowired
UserRepository userRepository;

@Transactional
	public User addUser(User addUser) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setRole(addUser.getRole());
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference(false);
		user.setRoles(addUser.getRoles());
		user.setNickname(addUser.getNickname());
		user.setPassword(addUser.getPassword());
		return user;
	}

	@Override
	public User updateUser(String userId, User updateUser) {
		// TODO Auto-generated method stub
		
		User user = new User();
		if(updateUser.getUserId().isEmpty() || updateUser.getUserId() == null){
			user.setUserId(userId);
		}
		if(updateUser.getEmail() != null){
			user.setEmail(updateUser.getEmail());
		}
		if(updateUser.getName() != null){
			user.setName(updateUser.getName());
		}
		if(updateUser.getRoles() != null){
			user.setRoles(updateUser.getRoles());
		}
		if(updateUser.getNickname() != null){
			user.setNickname(updateUser.getNickname());
		}
		if(updateUser.getPassword() != null) {
			user.setPassword(updateUser.getPassword());
		}
		
		
		user.setContactPreference(false);
		return user;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String UserId) {
		// TODO Auto-generated method stub
		
	}

	
	public User convertDtoIntoEntity(UserDTO userDTO){
		User user = new User();
		user.setActivated(userDTO.isActivated());
		user.setContactPreference(userDTO.isContactPreference());
		user.setUserId(userDTO.getUserId());
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		return user;
	}
}
