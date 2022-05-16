package com.variable.movidic.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.WebUtils;

import com.variable.movidic.domain.UserVO;
import com.variable.movidic.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	//회원가입
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(UserVO vo, RedirectAttributes red) {
		
		int result = userService.userRegister(vo);
		//TODO: 공백 체크
		if (result == 1) {
			red.addFlashAttribute("msg", "회원가입이 성공하였습니다.");
//			return "redirect:/user/login";
			return "redirect:/user/signup";
		} else {
			red.addFlashAttribute("msg", "회원가입이 실패했습니다.");
			return "redirect:/user/signup";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String signIn(@ModelAttribute("userVO")UserVO userVO) {
		logger.info("signIn() GET CALL");

		return "user/login";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		logger.info("signIn() GET CALL");

		return "user/signup";
	}

	//로그인
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String loginCheck(UserVO vo, HttpSession session, Model model, RedirectAttributes red) {

		UserVO userVO = userService.loginCheck(vo);
		
		logger.info("로그인 시 userVO => {}", userVO);

		if (userVO != null) {
			// 로그인 성공 시 로그인 유지
			//session.setAttribute("userVO", userVO);
			model.addAttribute("user", userVO);
			red.addFlashAttribute("msg", "로그인에 성공했습니다.");
			// 쿠키 생성
			return "user/login";
			
			
		} else {
			model.addAttribute("msg", "아이디 또는 비밀번호가 틀렸습니다.");
			return "user/login";
		}

	}
	
	//로그아웃 시 쿠키 지움
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req, HttpServletResponse res, HttpSession session) {
		Object obj = session.getAttribute("login");
		logger.info("obj -> -> {}", obj);
		
		if(obj != null) {
			UserVO userVO = (UserVO) obj;
			session.removeAttribute("login");
			session.invalidate();
			Cookie loginCookie = WebUtils.getCookie(req, "loginCookie");
			if(loginCookie != null) {
				loginCookie.setPath("/");
				loginCookie.setMaxAge(0);
				res.addCookie(loginCookie);
				
				
			}
			logger.info("로그아웃 성공");
		} else {
			logger.info("로그아웃 실패");
		}
		
		
		return "redirect:/";
	}	
	
	@RequestMapping(value = "/check_email", method = RequestMethod.POST,  produces="application/json")
	@ResponseBody
	public int check_email(@RequestBody UserVO vo,HttpServletResponse response) {
		
		logger.info("email: {}", vo.getEmail());
		//logger.info("name: {}", name);
		
		int result = userService.check_email(vo.getEmail());
		logger.info("result: {}", result);
		return result;
		
	}
	
	
	
	
	

}
