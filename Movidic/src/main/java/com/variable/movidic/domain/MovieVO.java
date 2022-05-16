package com.variable.movidic.domain;

import java.util.Date;

public class MovieVO {

	private int mno;
	private String title;
	private int rank;
	private String summary;
	private String genre;
	private String duration;
	private String film_ration;
	private Date openData;
	private String image;
	private int views;
	private String video;
	
	public MovieVO() {
		// TODO Auto-generated constructor stub
	}
	

	public MovieVO(int mno, String title, int rank, String summary, String genre, String duration, String film_ration,
			Date openData, String image, int views, String video) {
		super();
		this.mno = mno;
		this.title = title;
		this.rank = rank;
		this.summary = summary;
		this.genre = genre;
		this.duration = duration;
		this.film_ration = film_ration;
		this.openData = openData;
		this.image = image;
		this.views = views;
		this.video = video;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
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

	public Date getOpenData() {
		return openData;
	}

	public void setOpenData(Date openData) {
		this.openData = openData;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}


	@Override
	public String toString() {
		return "MovieVO [mno=" + mno + ", title=" + title + ", rank=" + rank + ", summary=" + summary + ", genre="
				+ genre + ", duration=" + duration + ", film_ration=" + film_ration + ", openData=" + openData
				+ ", image=" + image + ", views=" + views + ", video=" + video + "]";
	}
	
	
	
}
