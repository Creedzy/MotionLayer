package org.cg.Model;

import org.joda.time.DateTime;
import java.io.Serializable;

@Entity
@Table(name = "NOTIFICATION")
public class Notification implements Serializable
{
	Long id;
	String message;
	String receiver;
	String sender;
	DateTime date;
    
	@Id
    @GeneratedValue
    @Column(name = "ID")
	public void setId(Long id)
	{
		this.id = id;
	}
    
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
