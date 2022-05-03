package com.variable.movidic.domain;

import java.util.Date;

import lombok.*;


public class UserVO {

	private String email;
	private String name;
	private String pw;
	private Date regdate;
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public UserVO(String email, String name, String pw, Date regdate) {
		super();
		this.email = email;
		this.name = name;
		this.pw = pw;
		this.regdate = regdate;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	
	
}
