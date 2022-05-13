package com.variable.movidic.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.variable.movidic.domain.ReplieVO;
import com.variable.movidic.replie.service.ReplieService;



@RestController
@RequestMapping(value = "/replies")
public class ReplieRestController {
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	ReplieService replieservice;
	
	@RequestMapping(value = "all/{mno}", method = RequestMethod.POST)
	public int readAllReplies(@RequestBody ReplieVO replieVO) {
//		logger.info("mno => {}",mno);
		logger.info("replieVo => {}",replieVO.toString());

		
		int result = replieservice.insert(replieVO);
		logger.info("result => ",result);
		
		
		
		
		
		return result;
	}
	
	
	
	
}
