package com.example.demo.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class source {

	
	private String userid; 
	private String type;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
