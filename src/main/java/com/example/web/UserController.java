package com.example.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping("list")
	public String list(String email, HttpSession session){
		if(email != null){
			session.setAttribute("mid", email);
		}
		return "list";
	}
	
	@RequestMapping("insert")
	public String insert(){
		return "insert";
	}
	
	@RequestMapping("login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="loginPost",method=RequestMethod.POST)
	public String loginPost(String mid, String mpw, HttpSession session){
		//test id : id = user00 , password = pass
		if(mid.equals("user00") && mpw.equals("pass")){ //로그인 정보가 맞으면
			session.setAttribute("mid", mid); //일치한 mid를 httpsession에 저장해서 가져감
			//httpsession = 프로젝트가 종료될때까지 데이터 유지
			
			//만약에 인터셉터에서 받아온 des값이 비어있지 않으면 = 값이 있으면
			if(session.getAttribute("des") != null){
				return "redirect:"+session.getAttribute("des"); //저장되어있는 목적지로 이동함
			}
			//이게 처음 로그인할때는 이 작업을 진행하지 않으니까 바로 리스트 페이지로 가는데
			//글쓰기를 누른다음에 로그인을 하면 des값이 저장되니까 로그인을 하면 그 페이지로 이동하게끔 해주는 작업
		}
		return "redirect:/";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("mid");
		return "redirect:list";
	}
	
	//네아로
	@RequestMapping("naverlogin")
	public String naverlogin(){
		return "naverlogin";
	}
	
}
