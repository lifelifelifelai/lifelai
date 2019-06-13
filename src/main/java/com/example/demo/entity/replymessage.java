package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class replymessage {

	
	private String replyToken;
	private List<messagee> message=new ArrayList<messagee>();
	public String getReplyToken() {
		return replyToken;
	}
	public void setReplyToken(String replyToken) {
		this.replyToken = replyToken;
	}
	public List<messagee> getMessage() {
		return message;
	}
	public void setMessage(List<messagee> message) {
		this.message = message;
	}

	
}
