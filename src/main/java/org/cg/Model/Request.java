package org.cg.Model;


import org.joda.time.DateTime;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="request")
public abstract class Request {
	
	String requestId;
	String description;
	String shortDescription;
	DateTime submittionDate;
	DateTime responseDate;
	String name;
	boolean completed;
	DateTime date;
	@DynamoDBHashKey
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	@DynamoDBAttribute
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@DynamoDBAttribute
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	@DynamoDBAttribute
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	@DynamoDBAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@DynamoDBAttribute
	public DateTime getSubmittionDate() {
		return submittionDate;
	}
	public void setSubmittionDate(DateTime submittionDate) {
		this.submittionDate = submittionDate;
	}
	@DynamoDBAttribute
	public DateTime getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(DateTime responseDate) {
		this.responseDate = responseDate;
	}
	@DynamoDBAttribute
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
