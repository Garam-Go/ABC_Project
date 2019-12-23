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
		if(mid.equals("user00") && mpw.equals("pass")){ //�α��� ������ ������
			session.setAttribute("mid", mid); //��ġ�� mid�� httpsession�� �����ؼ� ������
			//httpsession = ������Ʈ�� ����ɶ����� ������ ����
			
			//���࿡ ���ͼ��Ϳ��� �޾ƿ� des���� ������� ������ = ���� ������
			if(session.getAttribute("des") != null){
				return "redirect:"+session.getAttribute("des"); //����Ǿ��ִ� �������� �̵���
			}
			//�̰� ó�� �α����Ҷ��� �� �۾��� �������� �����ϱ� �ٷ� ����Ʈ �������� ���µ�
			//�۾��⸦ ���������� �α����� �ϸ� des���� ����Ǵϱ� �α����� �ϸ� �� �������� �̵��ϰԲ� ���ִ� �۾�
		}
		return "redirect:/";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("mid");
		return "redirect:list";
	}
	
	//�׾Ʒ�
	@RequestMapping("naverlogin")
	public String naverlogin(){
		return "naverlogin";
	}
	
}
