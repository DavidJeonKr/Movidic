package com.variable.movidic.movie.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.variable.movidic.domain.CountVO;
import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.domain.RatingVO;
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
	//조회수 증가
	@Override
	public int updateHitCnt(int mno) {
		
		
		return movieMapper.updateHitCnt(mno);
	}
	
	//최근 댓글 영화목록
	@Override
	public List<MovieVO> getRecentReplie() {
		
		return movieMapper.getRecentReplie();
	}
	// 평점 주기
	@Override
	public int insertRating(RatingVO ratingVO) {
		
		
		return movieMapper.insertRating(ratingVO);
	}
	// 평점 평균 / 카운트 조회
	@Override
	public Map<String, Object> avgRating(int mno) {
		
		Map<String, Object> map = (HashMap<String, Object>) movieMapper.avgRating(mno);
		
		return map;
	}

	@Override
	public RatingVO checkRating(RatingVO ratingVO) {
		
		
		return movieMapper.checkRating(ratingVO);
	}
	
	
	
	

}
