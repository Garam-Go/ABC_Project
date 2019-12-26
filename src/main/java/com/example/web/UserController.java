package com.example.web;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.MemberVO;
import com.example.persistence.MemberDAO;

@Controller
public class UserController {
	@Inject
	MemberDAO dao;

	@RequestMapping("home")
	public String home(String email, HttpSession session) {
		if (email != null) {
			session.setAttribute("mid", email);
		}
		return "home";
	}

	@RequestMapping("login")
	public String login() {
		return "/Member/login";
	}

	// �α��� �۾����� �����ϴ� post
	@RequestMapping(value = "loginPost", method = RequestMethod.POST)
	public String loginPost(MemberVO vo, HttpSession session) throws Exception {

		String mid = vo.getMid();

		String pass = dao.login(mid).getMpassword();

		if (vo.getMpassword().equals(pass)) {
			System.out.println("�α��� ���� ");
			session.setAttribute("mid", mid);
		} else if (vo.getMid().equals("admin") && vo.getMpassword().equals("admin")) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("admin_id", "admin");
			map.put("admin_name", "������");
			session.setAttribute("admin", map);
			return "redirect:/admin_main";

		} else {
			System.out.println("�α��� ����, ���̵� : " + mid);
			System.out.println("��й�ȣ : " + pass);
			return "redirect:login";
		}

		return "redirect:home";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("mid");
		return "redirect:home";
	}

	

	// ȸ������
	@RequestMapping("signIn")
	public String signIn() {
		return "/Member/signIn";
	}

	@RequestMapping(value = "signIn", method = RequestMethod.POST)
	public void signInPost(MemberVO vo, HttpSession session) throws Exception {
		dao.signIn(vo); 
		session.setAttribute("signlogin", vo.getMid());
	}

	
}
