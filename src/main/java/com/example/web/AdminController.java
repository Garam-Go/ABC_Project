package com.example.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.MemberVO;
import com.example.persistence.MemberDAO;

@Controller
public class AdminController {
	@Inject
	MemberDAO mdao;
	
	//어드민 메인페이지 이동
	@RequestMapping("AdminMain")
	public String main(){
		return "/Admin/AdminMain";
	}
	
	//회원리스트 확인
	@ResponseBody
	@RequestMapping("MemList")
	public List<MemberVO> Memlist() throws Exception{
		List<MemberVO> list = mdao.list();
		return list;
	}
}
