package com.variable.movidic.movie.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.variable.movidic.domain.CountVO;
import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.movie.mapper.MovieMapper;
import com.variable.movidic.util.Criteria;

@Service("movieService")
public class MovieServiceImpl implements MovieService{

	
	@Autowired
	private MovieMapper movieMapper;
	
	@Override
	public ArrayList<MovieVO> getRankData() {
		// TODO Auto-generated method stub
		
		return movieMapper.getRankData();
	}

	@Override
	public ArrayList<MovieVO> getLatelyData() {
		// TODO Auto-generated method stub
		return movieMapper.getLatelyData();
	}
	
	

	@Override
	public ArrayList<MovieVO> getCategoryData(Criteria cri) {
		// TODO Auto-generated method stub
		
		return movieMapper.getCategoryData(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		return movieMapper.getTotal(cri);
	}

	@Override
	public MovieVO read(int mno) {
		
		
		return movieMapper.read(mno);
	}

	@Override
	public ArrayList<MovieVO> getSidebarData() {
		// TODO Auto-generated method stub
		return movieMapper.getSidebarData();
	}

	//댓글 수 조회 수 조회
	@Override
	public CountVO getCount(int mno) {
		
		
		return movieMapper.getCount(mno);
	}

	@Override
	public int updateHitCnt(int mno) {
		
		
		return movieMapper.updateHitCnt(mno);
	}

}
