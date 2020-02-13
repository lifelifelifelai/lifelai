package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="status")
public class status {

	@Id
	@Column(name="id")
	private String id;
	
	
	@Column(name="status")
	private String status;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
}
