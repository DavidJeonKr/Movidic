package com.variable.movidic.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.variable.movidic.domain.CountVO;
import com.variable.movidic.domain.MovieVO;
import com.variable.movidic.domain.RatingVO;
import com.variable.movidic.movie.service.MovieService;
import com.variable.movidic.util.Criteria;
import com.variable.movidic.util.PageVO;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	@Qualifier("movieService")
	private MovieService movieService;
	
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public String categoryPage() {
		
		return "movie/category";
	}
	
	// Detail 페이지 get method
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detailPage(@RequestParam int mno, Model model) {
		logger.info("detail 페이지");
		
		
		MovieVO movie = movieService.read(mno);
		movieService.updateHitCnt(mno);
		CountVO count = movieService.getCount(mno);
//		logger.info("MovieController => count : {}", count.toString());
		
		Map<String, Integer> rating = movieService.avgRating(mno); 
		logger.info("{}",rating.get("rating"));
		logger.info("{}",rating.get("count"));
		
		
		//logger.info(movie.toString());
//		logger.info(count.toString());
		model.addAttribute("movie", movie);
		model.addAttribute("count", count);
		model.addAttribute("rating", rating);

		
		return "movie/detail";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getRankData", method=RequestMethod.GET, produces="application/json")
	public HashMap<String, Object> getRankData(){
		ArrayList<MovieVO> list= movieService.getRankData();
		
		HashMap<String, Object> map= new HashMap<>();
		map.put("list", list);
		
		
//		logger.info("MovieController 호출 => map: {} ", map.get(list));
		
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
	
	@ResponseBody
	@RequestMapping(value="/getSidebarData", method=RequestMethod.GET, produces="application/json")
	public HashMap<String, Object> getSidebarData(){
		
		HashMap<String,Object> map = new HashMap<>();
		ArrayList<MovieVO> list = movieService.getSidebarData();
		
		map.put("list", list);
		
		return map;
	}
	@ResponseBody
	@RequestMapping(value = "/getRecentReplie", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<MovieVO>> getRecentReplie() {
		
		List<MovieVO> list = movieService.getRecentReplie();
		//logger.info("MovieController 호출 => list: {}",list.get(0));
		ResponseEntity<List<MovieVO>> entity = new ResponseEntity<List<MovieVO>>(list, HttpStatus.OK);
		
		return entity;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertRating", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<RatingVO> insertRating(@RequestBody RatingVO ratingVO) {
		logger.info("MovieController insertRating 호출 => ratingVO: {}",ratingVO.toString());
		int result = movieService.insertRating(ratingVO);
		logger.info("MovieController insertRating 호출 => result: {}",result);
		ResponseEntity<RatingVO> entity = new ResponseEntity<RatingVO>(ratingVO, HttpStatus.OK);
		return entity;
	}
	
	@ResponseBody
	@RequestMapping(value = "/isCheck" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<RatingVO> isCheck(@RequestBody RatingVO ratingVO) {
		logger.info("MovieController - isCheck 호출 => ratingVO{}",ratingVO.toString());

		RatingVO vo = movieService.checkRating(ratingVO);
		logger.info("{}", vo);
		if(vo != null) {
			ResponseEntity<RatingVO> entity = new ResponseEntity<RatingVO>(vo, HttpStatus.OK);
			return entity;
			
		} else {
			//ResponseEntity<RatingVO> entity = new ResponseEntity<RatingVO>(vo, HttpStatus.OK);
			return null;
		}
	}
	
	
	
	
}
