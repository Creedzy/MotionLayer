package org.cg.Model.dto;

import org.joda.time.DateTime;

public class NotificationDTO
{
	Long id;
	String message;
	String receiver;
	String sender;
	DateTime date;


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

	public void setReceiver(String receiver)
	{
		this.receiver = receiver;
	}

	public String getReceiver()
	{
		return receiver;
	}

	public void setSender(String sender)
	{
		this.sender = sender;
	}

	public String getSender()
	{
		return sender;
	}

	public void setDate(DateTime date)
	{
		this.date = date;
	}

	public DateTime getDate()
	{
		return date;
	}}
