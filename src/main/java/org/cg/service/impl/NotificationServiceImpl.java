package org.cg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.cg.Model.Notification;
import org.cg.Model.User;
import org.cg.Model.dto.NotificationDTO;
import org.cg.Model.dto.UserDTO;
import org.cg.service.MessageService;
import org.cg.service.DAOS.NotificationDAO;
import org.dozer.DozerBeanMapper;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.cg.service.*;

@Service
public class NotificationServiceImpl implements NotificationService {

	Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
	DozerBeanMapper mapper = new DozerBeanMapper();

	@Autowired
	NotificationDAO mDao;

	@Override
	public NotificationDTO getNotification(Long notificationId) {
		NotificationDTO notification = convertEntityIntoDto(mDao.find(notificationId));

		logger.debug("Returning notification:{}",notification);

		return notification;
	}

	@Override
	public List<NotificationDTO> getNotificationsForUser(String userId) {
		List<Notification> notifications = mDao.findMessagesForUser(userId);
		List<NotificationDTO> notificationList = new ArrayList<NotificationDTO>();
		for(Notification notif : notifications) {
			notificationList.add(convertEntityIntoDto(notif));
		}
		logger.debug("Returning notifications for user:{}",notificationList);
		return notificationList;
	}

	@Override
	public List<NotificationDTO> getAllNotifications() {

		List<Notification> notifications = mDao.findAll();
		List<NotificationDTO> notificationList = new ArrayList<NotificationDTO>();
		for(Notification notif : notifications) {
			notificationList.add(convertEntityIntoDto(notif));
		}
		logger.debug("Returning notification List:{}",notificationList);
		return notificationList;
	}

	@Override
	public NotificationDTO saveNotification(NotificationDTO notificationDto) {

		Notification notificationEntity = convertDtoIntoEntity(notificationDto);
		logger.debug("Saving notification:{}",notificationEntity);
		mDao.create(notificationEntity);
		NotificationDTO notifDTO = convertEntityIntoDto(notificationEntity);
		return notifDTO;
	}

	@Override
	public void deleteNotification(NotificationDTO notifDto) {
		logger.debug("Deleting:{}",notifDto );
		mDao.delete(convertDtoIntoEntity(notifDto));
	}

	public NotificationDTO convertEntityIntoDto(Notification notification){
		NotificationDTO notificationDTO = mapper.map(notification,NotificationDTO.class);
		if (notificationDTO.getMessage() == null) {
			notificationDTO.setMessage(notification.getMessage());
		}
		return notificationDTO;
	}

	public Notification convertDtoIntoEntity(NotificationDTO notificationDTO){

		Notification notif = mapper.map(notificationDTO,Notification.class);
		if (notif.getMessage()==null){
			notif.setMessage(notificationDTO.getMessage());
		}

		return notif;
	}


}
