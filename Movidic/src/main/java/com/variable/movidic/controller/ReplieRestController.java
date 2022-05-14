package com.variable.movidic.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.variable.movidic.domain.ReplieVO;
import com.variable.movidic.replie.service.ReplieService;



@RestController
@RequestMapping(value = "/replies")
public class ReplieRestController {
	private static final Logger logger = LoggerFactory.getLogger(ReplieRestController.class);

	@Autowired
	private ReplieService replieService;

	


	//새 댓글 작성
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ResponseEntity<Integer> insertReplies(@RequestBody ReplieVO replieVO) {
//		logger.info("mno => {}",mno);
		logger.info("replieVo => {}",replieVO.toString());
		if(replieVO.getWriter().equals("")) {
			replieVO.setWriter("익명");
		}
		int result = replieService.insert(replieVO);
		logger.info("result => ",result);
		ResponseEntity<Integer> entity = new ResponseEntity<Integer>(result, HttpStatus.OK);

		
		return entity;
	}
	
	@RequestMapping(value = "/all/{mno}", method = RequestMethod.GET)
	public ResponseEntity<List<ReplieVO>> getAllReplies(@PathVariable("mno") Integer mno) {
		logger.info("getAllReplies get 요청");
		logger.info("mno => {}" , mno);
		List<ReplieVO> replieVO = replieService.read(mno);
		
		ResponseEntity<List<ReplieVO>> entity = new ResponseEntity<List<ReplieVO>>(replieVO, HttpStatus.OK);
		
		return entity;
	}
	
	
	
	
}
