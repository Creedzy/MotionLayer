package org.cg.service;

import java.util.List;

import org.cg.Model.Message;

public interface MessageService {
	
	
public Message getMessage(String messageId);
public List<Message> getAllMessages(String userId);
public Message saveMessage(Message message);
public void deleteMessage(String messageId);
}
