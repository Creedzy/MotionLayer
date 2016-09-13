package org.cg.Model.dto;

public class MessageDTO
{
	private String messageId;
	private DateTime date;
	private String sender;
	private String receiver;
	private String message;


	public void setMessageId(String messageId)
	{
		this.messageId = messageId;
	}

	public String getMessageId()
	{
		return messageId;
	}

	public void setDate(DateTime date)
	{
		this.date = date;
	}

	public DateTime getDate()
	{
		return date;
	}

	public void setSender(String sender)
	{
		this.sender = sender;
	}

	public String getSender()
	{
		return sender;
	}

	public void setReceiver(String receiver)
	{
		this.receiver = receiver;
	}

	public String getReceiver()
	{
		return receiver;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}}
