package org.cg.Model;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.joda.time.DateTime;


@Entity
@Table(name = "MESSAGES")
public class Message {

	private String messageId;
	private DateTime date;
	private String sender;
	private String receiver;
	private String message;
	
	@DynamoDBHashKey
	public String getMessageId() {
		return messageId;
	}
	
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	@DynamoDBAttribute
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	@DynamoDBAttribute
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	@DynamoDBAttribute
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	@DynamoDBAttribute
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
