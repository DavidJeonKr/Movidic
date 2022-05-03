package com.variable.movidic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.variable.movidic.user.service.UserService;
import com.variable.movidic.vo.UserVO;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	
	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public UserVO register() {
		
		return null;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String signIn() {
		logger.info("signIn() GET CALL");
		
		return "user/login";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		logger.info("signIn() GET CALL");
		
		return "user/signup";
	}

}
