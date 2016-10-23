package org.cg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.cg.Model.Message;
import org.cg.Model.Role;
import org.cg.Model.User;
import org.cg.Model.dto.MessageDTO;
import org.cg.Model.dto.RoleDTO;
import org.cg.Model.dto.UserDTO;
import org.cg.service.MessageService;
import org.cg.service.DAOS.MessageDAO;
import org.dozer.DozerBeanMapper;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
	
	Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
	DozerBeanMapper mapper = new DozerBeanMapper();
	
	@Autowired
	MessageDAO mDao;
	
	@Override
	public MessageDTO getMessage(Long messageId) {
		MessageDTO message = convertEntityIntoDto(mDao.find(messageId));
		
		logger.debug("Returning message:{}",message);
		
		return message;
	}
	
	@Override
	public List<MessageDTO> getMessagesForUser(String userId) {
		List<Message> messages = mDao.findMessagesForUser(userId);
		List<MessageDTO> messageList = new ArrayList<MessageDTO>();
		for(Message message : messages) {
			messageList.add(convertEntityIntoDto(message));
		}
		logger.debug("Returning message:{}",messageList);
		return messageList;
	}

	@Override
	public List<MessageDTO> getAllMessages() {

		List<Message> messages = mDao.findAll();
		List<MessageDTO> messageList = new ArrayList<MessageDTO>();
		for(Message message : messages) {
			messageList.add(convertEntityIntoDto(message));
		}
		logger.debug("Returning message:{}",messageList);
		return messageList;
	}

	@Override
	public MessageDTO saveMessage(MessageDTO message) {
		
		Message messageEntity = convertDtoIntoEntity(message);
		logger.debug("Saving message:{}",messageEntity);
		mDao.create(messageEntity);
		MessageDTO messageDTO = convertEntityIntoDto(messageEntity);
		return messageDTO;
	}

	@Override
	public void deleteMessage(MessageDTO messageDto) {
		logger.debug("Deleting:{}",messageDto );
		mDao.delete(convertDtoIntoEntity(messageDto));
	}
	
	public MessageDTO convertEntityIntoDto(Message message){
		MessageDTO messageDTO = mapper.map(message,MessageDTO.class);
		if (messageDTO.getMessageId() == null) {
			messageDTO.setMessageId(message.getMessageId());
		}
		return messageDTO;
	}
	
	public Message convertDtoIntoEntity(MessageDTO messageDTO){
		
		Message message = mapper.map(messageDTO,Message.class);
		if (message.getMessageId()==null){
			message.setMessageId(messageDTO.getMessageId());
		}
		
		return message;
	}

	
}
