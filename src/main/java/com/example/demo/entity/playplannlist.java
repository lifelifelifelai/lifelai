package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="playplannlist")
public class playplannlist {

	
	@Id
	@Column(name="cttime")
	private String cttime;
	
	
	@Column(name="date")
	private String date;
	
	@Column(name="go2")
	private String go2;


	@Column(name="how")
	private String how;


	@Column(name="memo")
	private String memo;


	public String getCttime() {
		return cttime;
	}


	public void setCttime(String cttime) {
		this.cttime = cttime;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getGo2() {
		return go2;
	}


	public void setGo2(String go2) {
		this.go2 = go2;
	}


	public String getHow() {
		return how;
	}


	public void setHow(String how) {
		this.how = how;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}




	
	
}
