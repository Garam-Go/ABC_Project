package com.example.domain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("�α��� ���ͼ��� �׽�Ʈ pre");
		//������ �������� �α��� �ϴ°�
//		if(request.getSession().getAttribute("admin") == null ){
//            response.sendRedirect();
//		}
		//���̹� ���̵�� �α��������� �ٷ� ȸ�������ϵ��� ��
		
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("�α��� ���ͼ��� �׽�Ʈ post");
		super.postHandle(request, response, handler, modelAndView);
	}
}
