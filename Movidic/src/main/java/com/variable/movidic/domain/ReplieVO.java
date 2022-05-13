package com.variable.movidic.domain;

import java.util.Date;

public class ReplieVO {

	
	private int rno;
	private String content;
	private String writer;
	private Date regdate;
	private int mno;
	
	public ReplieVO() {
		
	}
	
	public ReplieVO(int rno, String content, String writer, Date regdate, int mno) {
		super();
		this.rno = rno;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.mno = mno;
	}


	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}

	@Override
	public String toString() {
		return "ReplieVO [rno=" + rno + ", content=" + content + ", writer=" + writer + ", regdate=" + regdate
				+ ", mno=" + mno + "]";
	}
	
	
}
