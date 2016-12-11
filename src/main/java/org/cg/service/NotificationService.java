package org.cg.service;

import java.util.List;
import org.cg.Model.dto.*;

import


public interface NotificationService {


	public NotificationDTO getNotification(Long messageId);
	public NotificationDTO saveNotification(NotificationDTO message);
	public void deleteNotification(NotificationDTO messageDto);
	public List<NotificationDTO> getAllNotifications();
	public List<NotificationDTO> getNotificationsForUser(String userId);
}
