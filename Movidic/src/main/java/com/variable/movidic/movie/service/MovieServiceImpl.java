package com.variable.movidic.movie.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.movie.mapper.MovieMapper;

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
	public ArrayList<MovieVO> getCategoryData() {
		// TODO Auto-generated method stub
		return movieMapper.getCategoryData();
	}

}
