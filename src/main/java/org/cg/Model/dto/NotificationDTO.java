package org.cg.Model.dto;

import org.cg.Model.User;
import org.joda.time.DateTime;

public class NotificationDTO
{
	Long id;
	String message;
	
	
	DateTime date;
	private User sender;
	private User receiver;

	public void setReceiver(User receiver)
	{
		this.receiver = receiver;
	}

	public User getReceiver()
	{
		return receiver;
	}

	public void setSender(User sender)
	{
		this.sender = sender;
	}

	public User getSender()
	{
		return sender;
	}
	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}


	public void setDate(DateTime date)
	{
		this.date = date;
	}

	public DateTime getDate()
	{
		return date;
	}}
