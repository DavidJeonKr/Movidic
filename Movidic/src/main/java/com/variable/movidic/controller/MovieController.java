package com.variable.movidic.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.movie.service.MovieService;
import com.variable.movidic.util.Criteria;
import com.variable.movidic.util.PageVO;

@Controller
@RequestMapping("/movie")
public class MovieController {

	
	@Autowired
	@Qualifier("movieService")
	private MovieService movieService;
	
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public String categoryPage() {
		
		return "movie/category";
	}
	
	// mno번호 받기
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detailPage() {
		
		
		return "movie/detail";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getRankData", method=RequestMethod.GET, produces="application/json")
	public HashMap<String, Object> getRankData(){
		ArrayList<MovieVO> list= movieService.getRankData();

		HashMap<String, Object> map= new HashMap<>();
		map.put("list", list);
		
		return map;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/getLatelyData", method=RequestMethod.GET, produces="application/json")
	public HashMap<String, Object> getLatelyData(){

		ArrayList<MovieVO> list =movieService.getLatelyData();
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", list);
	
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/getCategoryData", method=RequestMethod.GET, produces="application/json")
	public HashMap<String, Object> getCategoryData(@RequestParam("pageNum") int pageNum,
													@RequestParam("genreName") String genreName){

		
		Criteria cri =new Criteria(pageNum, 12);
		cri.setGenreName(genreName);
		
		int total = movieService.getTotal(cri);
		PageVO pageVO=new PageVO(cri, total);
		
		ArrayList<MovieVO> list =movieService.getCategoryData(cri);
		
		
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("pageVO", pageVO);
	
		return map;
	}
	
}
