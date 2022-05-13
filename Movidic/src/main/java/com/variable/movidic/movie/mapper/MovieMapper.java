package com.variable.movidic.movie.mapper;

import java.util.ArrayList;

import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.util.Criteria;

public interface MovieMapper {

	public ArrayList<MovieVO> getRankData();
	public ArrayList<MovieVO> getLatelyData();
	public ArrayList<MovieVO> getCategoryData(Criteria cri);
	public ArrayList<MovieVO> getSidebarData();
	public int getTotal(Criteria cri);
	public ArrayList<MovieVO> getCategoryData();
	MovieVO read(int mno);

}
