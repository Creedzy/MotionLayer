package org.cg.rest;

import java.util.List;
import java.util.ArrayList;

import org.cg.Model.Message;
import org.cg.Model.User;
import org.cg.service.impl.MessageServiceImpl;
import org.cg.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{


	public static final Logger logger = LoggerFactory.getLogger(MessageController.class);

	@Autowired
	MessageServiceImpl messageService;

	@RequestMapping(value="/message/{id}" , method=RequestMethod.GET)
	public Message getUser(@PathVariable("id") String messageId) {
		logger.debug("Getting message with id:{}",messageId);
		Message message = messageService.getMessage(messageId);
		return message;

	}
	@RequestMapping(value = "/message/users/{id}", method=RequestMethod.GET)
	public List<Message> getAllMessages(@PathVariable("id") String userId) {
		logger.debug("Returning all users");
		List<Message> users = messageService.getAllMessages(userId);
		return users;
	}

	@RequestMapping(value="/message", method= RequestMethod.POST) 
	public Message addUser(@RequestBody Message message) {
		logger.debug("Preparing to add user");
		Message newMessage = messageService.saveMessage(message);
		return newMessage;
	}

	@RequestMapping(value="/message/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") String userId){
		logger.debug("Preparing to delete user with id:{}",userId);
		messageService.deleteMessage(userId);

	}

	
}
