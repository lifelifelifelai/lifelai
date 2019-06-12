package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class message {
	
private String id; 
private String type;
private String text;


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
}
