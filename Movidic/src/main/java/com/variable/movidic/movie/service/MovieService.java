package com.variable.movidic.movie.service;

import java.util.ArrayList;

import com.variable.movidic.domain.CountVO;
import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.util.Criteria;

public interface MovieService {
	public ArrayList<MovieVO> getRankData();
	public ArrayList<MovieVO> getLatelyData();
	public ArrayList<MovieVO> getCategoryData(Criteria cri);
	public ArrayList<MovieVO> getSidebarData();
	public int getTotal(Criteria cri);
	public MovieVO read(int mno);
	//댓글 수 조회 수 조회
	CountVO getCount(int mno);
	//조회수 증가
	int updateHitCnt(int mno);
 }
