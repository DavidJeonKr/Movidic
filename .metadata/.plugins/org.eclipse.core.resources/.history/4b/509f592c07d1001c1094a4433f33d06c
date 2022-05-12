package com.variable.movidic.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		if(result==1) {
			red.addFlashAttribute("msg","회원가입이 성공하였습니다." );			
			return "redirect:/user/login";
		}else {
			red.addFlashAttribute("msg", "회원가입이 실패했습니다.");
			return "redirect:/user/signup";
		}
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
	
<<<<<<< HEAD
	@RequestMapping(value="/loginCheck", method= RequestMethod.POST)
	public String loginCheck(UserVO vo, HttpSession session, Model model, RedirectAttributes red) {
		
		UserVO userVO = userService.loginCheck(vo);
		System.out.println(userVO);
		
		if(userVO!=null) {
			session.setAttribute("userVO", userVO);
			red.addFlashAttribute("msg", "로그인에 성공했습니다.");
			return "redirect:/";
		}else {
			model.addAttribute("msg", "아이디 또는 비밀번호가 틀렸습니다.");
			return "user/login";
		}
		
	}
=======
	//테스트
	
>>>>>>> cb1f507f6cf412126a29752917a15e7aabe22471
	

}
