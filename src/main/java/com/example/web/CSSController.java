package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSSController {
	//메인 페이지
	@RequestMapping("page")
	public String page(){
		return "page";
	}
	
	//약 리스트 출력 페이지
	@RequestMapping("Med-list")
	public String medlist(){
		return "/medicine/med-list";
	}
	
	//약 read 페이지
	@RequestMapping("Med-des")
	public String meddes(){
		return "/medicine/med-des";
	}
	
	/* 병원 검색 페이지*/
	@RequestMapping("Hos-main")
	public String dmainhtml()throws Exception{
		return "/Hospital/main";
	}
	

	/* 병원 상세 검색 */
	@RequestMapping("Hos-search")
	public String dsearchhtml(){
		return "/Hospital/search";
	}

	/* 병원 목록 read */
	@RequestMapping("Hos-detail")
	public String ddetailhtml(Model model)throws Exception{
		return "/Hospital/detail";
	}
	
	//마이 페이지
	@RequestMapping("mypage-mypage")
	public String mypagemypage(){
		return "/mypage/mypage";
	}
}
