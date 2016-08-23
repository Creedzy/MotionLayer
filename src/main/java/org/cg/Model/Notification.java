package org.cg.Model;

import org.joda.time.DateTime;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="notifications")
public class Notification
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
    @DynamoDBHashKey
	public Long getId()
	{
		return id;
	}

	public void setDate(DateTime date)
	{
		this.date = date;
	}
    @DynamoDBAttribute
	public DateTime getDate()
	{
		return date;
	}

	public void setSender(String sender)
	{
		this.sender = sender;
	}
    @DynamoDBAttribute
	public String getSender()
	{
		return sender;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
    @DynamoDBAttribute
	public String getMessage()
	{
		return message;
	}
	


	public void setReceiver(String receiver)
	{
		this.receiver = receiver;
	}
    @DynamoDBAttribute
	public String getReceiver()
	{
		return receiver;
	}}
