package com.example.web;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.MemberVO;
import com.example.domain.MessageVO;
import com.example.persistence.MemberDAO;
import com.example.persistence.MessageDAO;

@Controller
public class UserController {
	@Inject
	MemberDAO dao;
	@Inject
	MessageDAO msdao;
	
	
	@RequestMapping("page")
	public String page(String email, HttpSession session) {
		if (email != null) {
			session.setAttribute("mid", email);
		}
		return "page";
	}
	
	
	
	//홈
	@RequestMapping("home")
	public String home(String email, HttpSession session) {
		if (email != null) {
			session.setAttribute("mid", email);
		}
		return "home";
	}

	//로그인 이동
	@RequestMapping("login")
	public String login() {
		return "/Member/login";
	}

	// 로그인 작업으로 실행하는 post
	@RequestMapping(value = "loginPost", method = RequestMethod.POST)
	public String loginPost(MemberVO vo, HttpSession session) throws Exception {

		String mid = vo.getMid();

		
		
		//로그인 한 아이디가 db에 있는 id와 맞는지 평가해봄
		if(mid.equals(dao.login(mid).getMid())){
			
			String pass = dao.login(mid).getMpassword();
			
			
			//로그인 한 아이디의 비번이 DB에 있는 비번과 맞는지 평가해봄
			if (vo.getMpassword().equals(pass)&&dao.login(mid).getMstatus()!=5) {
				System.out.println("로그인 성공 ");
				session.setAttribute("mid", mid);
				return "redirect:page";
				
			//관리자 계정인지 검사	
			} else if (vo.getMpassword().equals(pass)&&dao.login(mid).getMstatus()==5) {

				session.setAttribute("admin", "관리자");
				session.setAttribute("mid", "admin");
				
				return "redirect:AdminMain";

			//비밀번호가 틀렸을시
			} else {
				System.out.println("로그인 실패, 아이디 : " + mid);
				System.out.println("비밀번호 : " + pass);
				
				return "redirect:login?error='login failed! check your password'";
			}
			
		//아이디가 틀렸을시
		}else {
			System.out.println("로그인 실패, 아이디 : " + mid);
			System.out.println("비밀번호 : ");
			
			return "redirect:login?error='login failed! check your id'";
		}
		

		
	}

	//로그아웃
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("mid");
		return "redirect:homepage";
	}

	

	// 회원가입
	@RequestMapping("signIn")
	public String signIn() {
		return "/Member/signIn";
	}

	//회원가입post
	@RequestMapping(value = "signIn", method = RequestMethod.POST)
	public void signInPost(MemberVO vo, HttpSession session) throws Exception {
		dao.signIn(vo); 
		session.setAttribute("signlogin", vo.getMid());
		MessageVO msvo = new MessageVO();
		msvo.setMscontent("가입을 환영합니다");
		msvo.setMssender("admin");
		msvo.setMstitle("가입을 환영합니다!");
		msvo.setMsreceiver(vo.getMid());
		msdao.insert(msvo);
	}

	
}
