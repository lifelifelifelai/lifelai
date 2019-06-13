package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import com.example.demo.entity.message;
import com.example.demo.entity.source;
public class Event {
	
private message message=new message();	
private source source=new source();
	private String replyToken; 
	
	private String timestamp;
	private String type;
	//private Message message;
	public message getMessage() {
		return message;
	}
	public void setMessage(message message) {
		this.message = message;
	}
	public source getSource() {
		return source;
	}
	public void setSource(source source) {
		this.source = source;
	}
	public String getReplyToken() {
		return replyToken;
	}
	public void setReplyToken(String replyToken) {
		this.replyToken = replyToken;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	


}
