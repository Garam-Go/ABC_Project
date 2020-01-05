package com.example.domain;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.persistence.MemberDAO;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	@Inject
	MemberDAO dao;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("로그인 인터셉터 테스트 pre");
		
		//로그인 작업 들어오면 session초기화
		HttpSession session = request.getSession();
		if(session.getAttribute("mid") != null){
			session.removeAttribute("mid");
		}
		
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("로그인 인터셉터 테스트 post");
//		//	관리자 계정으로 로그인 하는것
//			if(request.getSession().getAttribute("admin") != null ){
//				dao.update("admin",5);
//				response.sendRedirect("/Admin/AdminMain");
//			}else{
//				response.sendRedirect("home");
//			}
		super.postHandle(request, response, handler, modelAndView);
	}
}
