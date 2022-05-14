package com.variable.movidic.domain;

public class CountVO {

	
	private int view_cnt;
	private int replie_cnt;
	
	
	public CountVO() {
		
	}
	
	public CountVO(int view_cnt, int replie_cnt) {
		super();
		this.view_cnt = view_cnt;
		this.replie_cnt = replie_cnt;
	}
	
	
	public int getView_cnt() {
		return view_cnt;
	}
	public int getReplie_cnt() {
		return replie_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public void setReplie_cnt(int replie_cnt) {
		this.replie_cnt = replie_cnt;
	}

	@Override
	public String toString() {
		return "CountVO [view_cnt=" + view_cnt + ", replie_cnt=" + replie_cnt + "]";
	}
	
	
	
	
}
