package org.cg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.cg.Model.Role;
import org.cg.Model.User;
import org.cg.Model.dto.RoleDTO;
import org.cg.Model.dto.UserDTO;
import org.cg.service.UserService;
import org.cg.service.DAOS.RoleDAO;
import org.cg.service.DAOS.ServiceDAO;
import org.cg.service.DAOS.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.dozer.DozerBeanMapper;
import org.joda.time.DateTime;
@Service
public class UserServiceImpl  implements UserService{

Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
DozerBeanMapper mapper = new DozerBeanMapper();
@Autowired
public UserDAO userDao;

@Autowired
public RoleDAO roleDao;

@Transactional
	public UserDTO addUser(UserDTO addUser) {
		// TODO Auto-generated method stub
		User user = convertDtoIntoEntity(addUser);
		
	
		logger.debug("Creating user:{}",user.toString());
		userDao.create(user);
		return convertEntityIntoDto(user);
	}
	@Transactional
	@Override
	public UserDTO updateUser(Long userId, UserDTO updateUser) {
		
		
		User user = convertDtoIntoEntity(updateUser);
		if(  updateUser.getUserId() == null){
			user.setUserId(userId);
		}
		
		logger.debug("About to update user:{}",user);
		userDao.update(user);
		return convertEntityIntoDto(user);
	}

	@Override
	@Transactional
	public UserDTO getUser(Long userId) {
		UserDTO userDto = null;
		User user = userDao.find(userId);
		if(user != null){
			userDto = convertEntityIntoDto(user);
		}
		logger.debug("returning user : {}",userDto);
		return userDto;
	}

	@Override
	@Transactional
	public List<UserDTO> getUsersById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<UserDTO> getAllUsers() {
		List<UserDTO> userDto = new ArrayList<UserDTO>();
		List<User> userList = (List<User>) userDao.findAll();
		for(User user : userList ){
			userDto.add(convertEntityIntoDto(user));
		}
		logger.debug("Returning all users:{}",userDto);
		return userDto;
	}

	@Override
	@Transactional
	public void deleteUser(Long userId) {
		logger.debug("Deleting user with id:{}",userId);
		
		userDao.delete(userDao.find(userId));
		
	}

	
	
	
	public UserDTO convertEntityIntoDto(User userEntity){
		UserDTO user = mapper.map(userEntity,UserDTO.class);
		if (user.getUserId() == null) {
			user.setUserId(userEntity.getUserId());
		}
		return user;
	}
	
	public User convertDtoIntoEntity(UserDTO userDTO){
		
		User user = mapper.map(userDTO,User.class);
		if (user.getUserId()==null){
			user.setUserId(userDTO.getUserId());
		}
		if(userDTO.getRoles() != null) {
			List<Role> roles = new ArrayList<Role>();
			for(RoleDTO role : userDTO.getRoles()) {
				Role toAdd = mapper.map(role, Role.class);
				toAdd.setUser(user);
				DateTime date = new DateTime();
				toAdd.setDate(date);
				roles.add(toAdd);
			}
			user.setRole(roles);
		}
		return user;
	}
}
