package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSSController {
	//���� ������
	@RequestMapping("page")
	public String page(){
		return "page";
	}
	
	//�� ����Ʈ ��� ������
	@RequestMapping("Med-list")
	public String medlist(){
		return "/medicine/med-list";
	}
	
	//�� read ������
	@RequestMapping("Med-des")
	public String meddes(){
		return "/medicine/med-des";
	}
	
	/* ���� �˻� ������*/
	@RequestMapping("Hos-main")
	public String dmainhtml()throws Exception{
		return "/Hospital/main";
	}
	

	/* ���� �� �˻� */
	@RequestMapping("Hos-search")
	public String dsearchhtml(){
		return "/Hospital/search";
	}

	/* ���� ��� read */
	@RequestMapping("Hos-detail")
	public String ddetailhtml(Model model)throws Exception{
		return "/Hospital/detail";
	}
	
	//���� ������
	@RequestMapping("mypage-mypage")
	public String mypagemypage(){
		return "/mypage/mypage";
	}
}
