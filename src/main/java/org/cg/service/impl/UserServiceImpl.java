package org.cg.service.impl;

import com.fasterxml.jackson.databind.*;
import java.util.*;
import org.cg.Model.*;
import org.cg.Model.dto.*;
import org.cg.service.*;
import org.hibernate.*;
import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
public class UserServiceImpl  implements UserService{
ObjectMapper mapper = new ObjectMapper();
Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

@Autowired
public ServiceDAO service;


@Transactional
	public User addUser(UserDTO addUser) {
		// TODO Auto-generated method stub
		User user = convertDtoIntoEntity(addUser);
		
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference(addUser.isContactPreference());
		
		user.setNickname(addUser.getNickname());
		user.setPassword(addUser.getPassword());
		service.saveObject(user);
		return user;
	}
@Transactional
	@Override
	public User updateUser(Long userId, UserDTO updateUser) {
		// TODO Auto-generated method stub
		
		User user = convertDtoIntoEntity(updateUser);
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
		service.updateObject(
		return user;
	}

	@Override
	@Transactional
	public UserDTO getUser(Long userId) {
		UserDTO user;
		user = convertEntityIntoDto(service.getObject(User.class,userId));
		
		logger.debug("returning user : {}",user);
		return user;
	}

	@Override
	@Transactional
	public List<User> getUsersById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<UserDTO> getAllUsers() {
		List<UserDTO> userDto = new ArrayList<UserDTO>();
		List<User> user = service.returnList(User.class);
		for(User u : user ){
			userDto.add(convertEntityIntoDto(u));
		}
		return userDto;
	}

	@Override
	@Transactional
	public void deleteUser(Long userId) {
		logger.debug("Deleting user with id:{}",userId);
		service.deleteById("USERS",userId);
		
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
		return user;
	}
}
