package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity(name="playstatus")
public class playstatus {

	
	@Id
	@Column(name="name1")
	private String name1;
	
	
	@Column(name="status1")
	private String status1;
	
	@Column(name="status2")
	private String status2;


	@Column(name="status3")
	private String status3;


	public String getName1() {
		return name1;
	}


	public void setName1(String name1) {
		this.name1 = name1;
	}


	public String getStatus1() {
		return status1;
	}


	public void setStatus1(String status1) {
		this.status1 = status1;
	}


	public String getStatus2() {
		return status2;
	}


	public void setStatus2(String status2) {
		this.status2 = status2;
	}


	public String getStatus3() {
		return status3;
	}


	public void setStatus3(String status3) {
		this.status3 = status3;
	}




	
	
}
