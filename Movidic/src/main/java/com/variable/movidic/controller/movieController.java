package com.variable.movidic.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.movie.service.MovieService;

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
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detailPage() {
		return "movie/detail";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getRankData", method=RequestMethod.GET, produces="application/json")
	public HashMap<String, Object> getRankData(){
		ArrayList<MovieVO> list= movieService.getRankData();
		System.out.println("랭크데이터");
		System.out.println(list);
		HashMap<String, Object> map= new HashMap<>();
		map.put("list", list);
		
		return map;
		
	}
}
