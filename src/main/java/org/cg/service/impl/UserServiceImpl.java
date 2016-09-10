package org.cg.service.impl;

import java.util.List;

import org.cg.Model.User;
import org.cg.service.UserService;
import org.springframework.stereotype.Service;
import org.springframewo
@Service
public class UserServiceImpl implements UserService {

private final JdbcTemplate jdbcTemplate;
	
public UserServiceImpl (DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
}


@Transactional
	public User addUser(User addUser) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setRole(addUser.getRole());
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference();
		
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
		user.setContactPreference();
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

}
