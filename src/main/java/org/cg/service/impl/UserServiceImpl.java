package org.cg.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.cg.Model.dto.UserDTO;
import org.cg.Model.User;
import org.cg.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {



@Transactional
	public User addUser(User addUser) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setRole(addUser.getRole());
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference(false);
		
		return user;
	}

	@Override
	public User updateUser(String userId, User updateUser) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setRole(updateUser.getRole());
		user.setEmail(updateUser.getEmail());
		user.setName(updateUser.getName());
		user.setUserId(updateUser.getUserId());
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
