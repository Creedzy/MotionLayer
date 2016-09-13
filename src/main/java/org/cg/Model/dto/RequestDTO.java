package org.cg.Model.dto;

import org.joda.time.DateTime;

public class RequestDTO
{

	String requestId;
	String description;
	String shortDescription;
	DateTime submittionDate;
	DateTime responseDate;
	String name;
	boolean completed;
	DateTime date;


	public void setRequestId(String requestId)
	{
		this.requestId = requestId;
	}

	public String getRequestId()
	{
		return requestId;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setShortDescription(String shortDescription)
	{
		this.shortDescription = shortDescription;
	}

	public String getShortDescription()
	{
		return shortDescription;
	}

	public void setSubmittionDate(DateTime submittionDate)
	{
		this.submittionDate = submittionDate;
	}

	public DateTime getSubmittionDate()
	{
		return submittionDate;
	}

	public void setResponseDate(DateTime responseDate)
	{
		this.responseDate = responseDate;
	}

	public DateTime getResponseDate()
	{
		return responseDate;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setCompleted(boolean completed)
	{
		this.completed = completed;
	}

	public boolean isCompleted()
	{
		return completed;
	}

	public void setDate(DateTime date)
	{
		this.date = date;
	}

	public DateTime getDate()
	{
		return date;
	}}
