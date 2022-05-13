package com.variable.movidic.domain;

import java.util.Date;

import lombok.*;


public class UserVO {

	private String email;
	private String name;
	private String pw;
	private Date regdate;
	private String profile;
	private String session_key;
	private Date session_limit;
	
	
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

	


	public String getProfile() {
		return profile;
	}



	public void setProfile(String profile) {
		this.profile = profile;
	}



	public String getSession_key() {
		return session_key;
	}



	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}



	public Date getSession_limit() {
		return session_limit;
	}



	public void setSession_limit(Date session_limit) {
		this.session_limit = session_limit;
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
