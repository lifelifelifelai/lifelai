package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import com.example.demo.entity.message;
import com.example.demo.entity.source;
public class Event {
	
private message message;	
private source source;
	private String replyToken; 
	
	private String timestmap;
	private String type;
	//private Message message;
	
	public String getReplytoken() {
		return replyToken;
	}
	public void setReplytoken(String replytoken) {
		this.replyToken = replytoken;
	}
	public source getSource() {
		return source;
	}
	public void setSource(source source) {
		this.source = source;
	}
	public String getTimestmap() {
		return timestmap;
	}
	public void setTimestmap(String timestmap) {
		this.timestmap = timestmap;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public message getMessage() {
		return message;
	}
	public void setMessage(message message) {
		this.message = message;
	}

}
