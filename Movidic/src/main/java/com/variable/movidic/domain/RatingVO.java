package com.variable.movidic.domain;

public class RatingVO {

	private int mno;
	private int rating;
	private String email;
	private int ischeck;
	
	public RatingVO() {
		
	}
	public RatingVO(int mno, int rating, String email, int ischeck) {
		super();
		this.mno = mno;
		this.rating = rating;
		this.email = email;
		this.ischeck = ischeck;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIscheck() {
		return ischeck;
	}
	public void setIscheck(int ischeck) {
		this.ischeck = ischeck;
	}
	@Override
	public String toString() {
		return "RatingVO [mno=" + mno + ", rating=" + rating + ", email=" + email + ", ischeck=" + ischeck + "]";
	}
	
	
	
	
	
}
