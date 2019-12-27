package com.example.domain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("로그인 인터셉터 테스트 pre");
		//관리자 계정으로 로그인 하는것
//		if(request.getSession().getAttribute("admin") == null ){
//            response.sendRedirect();
//		}
		//네이버 아이디로 로그인했을시 바로 회원가입하도록 함
		
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("로그인 인터셉터 테스트 post");
		super.postHandle(request, response, handler, modelAndView);
	}
}
