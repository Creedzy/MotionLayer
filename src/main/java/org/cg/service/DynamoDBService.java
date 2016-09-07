package org.cg.service;

import org.cg.Model.User;
import java.util.List;
import org.cg.Model.Message;
public  interface DynamoDBService  {
    //Users
	public User addUser(User user);
    public User updateUser(String userId, User user);
	public User getUser(String userId);
	public List<User> getUsersById();
	public List<User> getAllUsers();
	public void deleteUser(String UserId);
	//Messages
	public Message getMessage(String messageId);
	public List<Message> getAllMessages(String userId);
	public Message saveMessage(Message message);
	public void deleteMessage(String messageId);
	
	
	
}
