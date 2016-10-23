package org.cg.service;

import java.util.List;

import org.cg.Model.Message;
import org.cg.Model.dto.MessageDTO;

public interface MessageService {
	
	
public MessageDTO getMessage(Long messageId);
public MessageDTO saveMessage(MessageDTO message);
public void deleteMessage(MessageDTO messageDto);
public List<MessageDTO> getAllMessages();
public List<MessageDTO> getMessagesForUser(String userId);
}
