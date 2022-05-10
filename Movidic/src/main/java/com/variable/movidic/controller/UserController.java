package com.variable.movidic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.variable.movidic.domain.UserVO;
import com.variable.movidic.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	
	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(UserVO vo,RedirectAttributes red) {
		System.out.println(vo);
		int result=userService.userRegister(vo);
		System.out.println(result);
		red.addFlashAttribute("msg","회원가입이 성공하였습니다." );
		return "redirect:/user/login";
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
	
	//테스트
	
	

}
