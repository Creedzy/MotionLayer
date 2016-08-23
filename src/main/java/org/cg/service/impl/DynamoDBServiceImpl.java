package org.cg.service.impl;

import java.util.List;

import org.cg.Model.Message;
import org.cg.Model.User;
import org.cg.service.DynamoDBService;
import org.springframework.stereotype.Service;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Service
public class DynamoDBServiceImpl implements DynamoDBService
{
	
	
	public User addUser(User addUser){
		User user = new User();
		user.setRole(addUser.getRole());
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference();
		return user;
		
		
	}
	public User updateUser(User updateUser){
		
		User user = new User();
		user.setRole(updateUser.getRole());
		user.setEmail(updateUser.getEmail());
		user.setName(updateUser.getName());
		user.setUserId(updateUser.getUserId());
		user.setContactPreference();
		return user;
		
		
	}
	
	public User getUser(String hashkey){
		
		User user = new User();
	
		
		return user;
		
	}
	
	@Override
	public User updateUser(String userId, User user) {
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
	@Override
	public Message getMessage(String messageId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Message> getAllMessages(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Message saveMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteMessage(String messageId) {
		// TODO Auto-generated method stub
		
	}
	
}
