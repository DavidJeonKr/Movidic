package com.variable.movidic.domain;

public class MovieVO {

	private int mno;
	private String title;
	
	private String summary;
	private String genre;
	private String duration;
	private String film_ration;
	private String openData;
	private String image;
	

	public MovieVO() {
		// TODO Auto-generated constructor stub
	}

	
	

	public MovieVO(int mno, String title, String summary, String genre, String duration, String film_ration,
			String openData, String image) {
		super();
		this.mno = mno;
		this.title = title;
		this.summary = summary;
		this.genre = genre;
		this.duration = duration;
		this.film_ration = film_ration;
		this.openData = openData;
		this.image = image;
	}




	public int getMno() {
		return mno;
	}



	public void setMno(int mno) {
		this.mno = mno;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getSummary() {
		return summary;
	}



	public void setSummary(String summary) {
		this.summary = summary;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getDuration() {
		return duration;
	}



	public void setDuration(String duration) {
		this.duration = duration;
	}



	public String getFilm_ration() {
		return film_ration;
	}



	public void setFilm_ration(String film_ration) {
		this.film_ration = film_ration;
	}



	public String getOpenData() {
		return openData;
	}



	public void setOpenData(String openData) {
		this.openData = openData;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "MovieVO [mno=" + mno + ", title=" + title + ", summary=" + summary + ", genre=" + genre + ", duration="
				+ duration + ", film_ration=" + film_ration + ", openData=" + openData + ", image=" + image + "]";
	}
	
}
