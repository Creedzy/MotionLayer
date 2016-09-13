package org.cg.Model.dto;

import org.joda.time.DateTime;

public class MotionCaptureDTO
{
	String Id;
	String format;
	DateTime published;
	String Downloads;
	int Length;
	String framerate;
	String loopable;
	String uploader;
	String url;
	String requestId;
	


	public void setId(String id)
	{
		Id = id;
	}

	public String getId()
	{
		return Id;
	}

	public void setFormat(String format)
	{
		this.format = format;
	}

	public String getFormat()
	{
		return format;
	}

	public void setPublished(DateTime published)
	{
		this.published = published;
	}

	public DateTime getPublished()
	{
		return published;
	}

	public void setDownloads(String downloads)
	{
		Downloads = downloads;
	}

	public String getDownloads()
	{
		return Downloads;
	}

	public void setLength(int length)
	{
		Length = length;
	}

	public int getLength()
	{
		return Length;
	}

	public void setFramerate(String framerate)
	{
		this.framerate = framerate;
	}

	public String getFramerate()
	{
		return framerate;
	}

	public void setLoopable(String loopable)
	{
		this.loopable = loopable;
	}

	public String getLoopable()
	{
		return loopable;
	}

	public void setUploader(String uploader)
	{
		this.uploader = uploader;
	}

	public String getUploader()
	{
		return uploader;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getUrl()
	{
		return url;
	}

	public void setRequestId(String requestId)
	{
		this.requestId = requestId;
	}

	public String getRequestId()
	{
		return requestId;
	}}
