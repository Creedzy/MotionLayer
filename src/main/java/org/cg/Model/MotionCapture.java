package org.cg.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.joda.time.DateTime;
import java.io.Serializable;



@Entity
@Table(name = "MOTION_CAPTURE")
public class MotionCapture implements Serializable {
	
	@javax.persistence.Id
    @GeneratedValue
    @Column(name = "ID")
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
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
	
	
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
