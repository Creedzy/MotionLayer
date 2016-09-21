package org.cg.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.cg.Model.User;
import org.cg.Model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.cg.repository.UserRepository;
import org.cg.service.ServiceDAO;
import org.cg.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceDAO implements UserService{
ObjectMapper mapper = new ObjectMapper();
Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


@Transactional
	public User addUser(User addUser) {
		// TODO Auto-generated method stub
		User user = new User();
		
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference(addUser.isContactPreference());
		user.setRole(addUser.getRole());
		user.setNickname(addUser.getNickname());
		user.setPassword(addUser.getPassword());
		Session session = getCurrentSession();
		session.save(user);
		return user;
	}

	@Override
	public User updateUser(Long userId, User updateUser) {
		// TODO Auto-generated method stub
		
		User user = new User();
		if(  updateUser.getUserId() == null){
			user.setUserId(userId);
		}
		if(updateUser.getEmail() != null){
			user.setEmail(updateUser.getEmail());
		}
		if(updateUser.getName() != null){
			user.setName(updateUser.getName());
		}
		if(updateUser.getRole() != null){
			user.setRole(updateUser.getRole());
		}
		if(updateUser.getNickname() != null){
			user.setNickname(updateUser.getNickname());
		}
		if(updateUser.getPassword() != null) {
			user.setPassword(updateUser.getPassword());
		}
		
		if(updateUser.isContactPreference() != null) {
		user.setContactPreference(updateUser.isContactPreference());
		}
		return user;
	}

	@Override
	@Transactional
	public User getUser(Long userId) {
		User user;
		Session session = sessionFactory.getCurrentSession();
		logger.debug("is session open :{}",session.isOpen());
		
		user = (User) session.get(User.class, userId);
		
		logger.debug("returning user : {}",user);
		return user;
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
	public void deleteUser(Long UserId) {
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
