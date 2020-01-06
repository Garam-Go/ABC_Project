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
	
	//���� ���������� �̵�
	@RequestMapping("AdminMain")
	public String main(){
		return "/Admin/AdminMain";
	}
	
	//ȸ������Ʈ Ȯ��
	@ResponseBody
	@RequestMapping("MemList")
	public List<MemberVO> Memlist() throws Exception{
		List<MemberVO> list = mdao.list();
		return list;
	}
}
