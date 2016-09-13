package org.cg.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;
import java.io.Serializable;

@Entity
@Table(name = "NOTIFICATION")
public class Notification implements Serializable
{
	@Id
    @GeneratedValue
    @Column(name = "ID")
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
	}}
