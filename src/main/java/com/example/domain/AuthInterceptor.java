package com.example.domain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		if(session.getAttribute("mid")==null){
			String path=request.getServletPath();
			System.out.println(path);
			if(request.getMethod().equals("GET")){
				session.setAttribute("dest", path);
			}
			response.sendRedirect("/Hospital/search");
		};
		return super.preHandle(request, response, handler);
	}
	
}
