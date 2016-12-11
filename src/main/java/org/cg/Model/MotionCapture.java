package org.cg.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;
import java.io.Serializable;



@Entity
@Table(name = "MOTION_CAPTURE")
public class MotionCapture implements Serializable {
	
	@javax.persistence.Id
    @GeneratedValue
    @Column(name = "ID")
	Long Id;
	String format;
	DateTime published;
	String Downloads;
	int Length;
	String framerate;
	String loopable;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private User uploader;
	
	String url;
	
	@OneToOne(fetch = FetchType.LAZY , mappedBy = "video")
	Request request;

	public void setReceiver(User receiver)
	{
		uploader = receiver;
	}

	public User getReceiver()
	{
		return uploader;
	}
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	public Request getRequestId() {
		return request;
	}
	public void setRequestId(Request requestId) {
		this.request = requestId;
	}
	
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	
	public DateTime getPublished() {
		return published;
	}
	public void setPublished(DateTime published) {
		this.published = published;
	}
	
	
	public String getDownloads() {
		return Downloads;
	}
	public void setDownloads(String downloads) {
		Downloads = downloads;
	}
	
	
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	
	
	public String getFramerate() {
		return framerate;
	}
	public void setFramerate(String framerate) {
		this.framerate = framerate;
	}
	
	
	public String getLoopable() {
		return loopable;
	}
	public void setLoopable(String loopable) {
		this.loopable = loopable;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
