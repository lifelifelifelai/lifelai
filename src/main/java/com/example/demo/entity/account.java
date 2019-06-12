package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="account")
public class account {

	
	@Id
	@Column(name="ac")
	private String ac;
	
	
	@Column(name="pas")
	private String pas;


	public String getAc() {
		return ac;
	}


	public void setAc(String ac) {
		this.ac = ac;
	}


	public String getPas() {
		return pas;
	}


	public void setPas(String pas) {
		this.pas = pas;
	}
	
	
	
	
}
