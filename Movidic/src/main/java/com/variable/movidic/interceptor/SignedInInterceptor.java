package com.variable.movidic.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.variable.movidic.domain.UserVO;
import com.variable.movidic.user.service.UserService;

public class SignedInInterceptor implements HandlerInterceptor{
	private static final Logger logger = LoggerFactory.getLogger(SignedInInterceptor.class);
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HttpSession httpSession = request.getSession();
		logger.info("httpSession => {}", httpSession);
		
		Object uservo = modelAndView.getModel().get("user");
		logger.info("objuser ==========> {}", uservo );
//		
		if(uservo != null) {
			logger.info("새로운 로그인 성공");
			httpSession.setAttribute("login", uservo);
			
			if(request.getParameter("useCookie") != null) {
				logger.info("쿠키 저장");
				Cookie loginCookie = new Cookie("loginCookie", httpSession.getId());
				loginCookie.setPath("/movidic");
				loginCookie.setMaxAge(60*60);
				
				response.addCookie(loginCookie);
			}
			
			Object dedestination = httpSession.getAttribute("destination");
			response.sendRedirect(dedestination != null ? (String) dedestination : "/movidic");
			
			
			//response.sendRedirect("/movidic");
			
		}
		
		
//		Cookie loginCookie = WebUtils.getCookie(request, "loginCookie");
		
//		if(loginCookie != null) {
//			//UserVO uservo = userservice.loginCheck(loginCookie.getValue());
//		}
		
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession httpSession = request.getSession();
		logger.info("SigninInterceptor preHandle httpSession => {}", httpSession);
		if(httpSession.getAttribute("login") != null) {
			logger.info("로그인 데이터 제거");
			httpSession.removeAttribute("login");
		}
		
		return true;
	}
	
	
	
}
