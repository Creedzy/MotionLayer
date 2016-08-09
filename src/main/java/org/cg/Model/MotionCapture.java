package org.cg.Model;

import org.joda.time.DateTime;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName = "motioncapture")
public class MotionCapture {

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
	
	@DynamoDBHashKey
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@DynamoDBAttribute
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	@DynamoDBAttribute
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	@DynamoDBAttribute
	public DateTime getPublished() {
		return published;
	}
	public void setPublished(DateTime published) {
		this.published = published;
	}
	
	@DynamoDBAttribute
	public String getDownloads() {
		return Downloads;
	}
	public void setDownloads(String downloads) {
		Downloads = downloads;
	}
	
	@DynamoDBAttribute
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	
	@DynamoDBAttribute
	public String getFramerate() {
		return framerate;
	}
	public void setFramerate(String framerate) {
		this.framerate = framerate;
	}
	
	@DynamoDBAttribute
	public String getLoopable() {
		return loopable;
	}
	public void setLoopable(String loopable) {
		this.loopable = loopable;
	}
	
	@DynamoDBAttribute
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	
	@DynamoDBAttribute
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
