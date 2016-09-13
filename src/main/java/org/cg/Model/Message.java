package org.cg.Model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import org.joda.time.DateTime;


@Entity
@Table(name = "MESSAGES")
public class Message implements Serializable  {

	private String messageId;
	private DateTime date;
	private String sender;
	private String receiver;
	private String message;
	
	@Id
    @GeneratedValue
    @Column(name = "MEESSAGE_ID")
	public String getMessageId() {
		return messageId;
	}
	
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
