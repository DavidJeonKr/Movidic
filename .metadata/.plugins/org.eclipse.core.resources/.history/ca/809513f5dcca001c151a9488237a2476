package com.variable.movidic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register() {
		logger.info("register() GET CALL ");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String signIn() {
		logger.info("signIn() GET CALL");
		
		return "/user/login";
	}
	
<<<<<<< HEAD
	@RequestMapping("/signup")
	public String userSignup() {
		return "/user/signup";
	}
	
	
=======
>>>>>>> 328d4c97a762c4cfa7e4f9e93820892cdf465144
}
