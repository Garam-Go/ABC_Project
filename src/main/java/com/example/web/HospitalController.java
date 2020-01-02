package com.example.web;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.PageMaker;
import com.example.domain.ReviewVO;
import com.example.domain.SearchCriteria;
import com.example.persistence.HDAO;
import com.example.persistence.ReviewDAO;

@RequestMapping("Hospital")
@Controller
public class HospitalController {
	@RequestMapping("main")
	public String main(){
		PageMaker pm=new PageMaker();
		HashMap<String,Object> map= new HashMap<String,Object>();
		map.put("pm", pm);
		return "/Hospital/main";
	}
	
	@Inject
	HDAO dao;
	
	//코드,이름 저장
	@ResponseBody
	@RequestMapping("insert.json")
	public void insertjson(HVO vo) throws Exception{
		 dao.insert(vo);
	}

	//지도빼고 다
	@ResponseBody
	@RequestMapping("tinsert.json")
	public void tinsert(HVO vo) throws Exception{
		System.out.println(vo.toString()); 
		dao.tinsert(vo);
		 
	}
	

	
	
	@ResponseBody
	@RequestMapping("list.json")
	public List<HVO> listjson() throws Exception{
		System.out.println(dao.list()); 
		return	dao.list(); 
	}
	
	@ResponseBody
	@RequestMapping("slist.json")
	public List<HVO> slistjson(SearchCriteria cri) throws Exception{
		//System.out.println(dao.slist(cri));
		return	dao.slist(cri); 	
	}
	
	@ResponseBody
	@RequestMapping("update.json")
	public void update(HVO vo) throws Exception{
		dao.update(vo);
	}
	

	
	
	/*
	@ResponseBody
	@RequestMapping("read.json")
	public HVO readjson(String h_code) throws Exception{
		//System.out.println(dao.read(h_code));
		return	dao.read(h_code); 
		
	}
	*/
	
	
	
	
	@RequestMapping("search")
	public String search(Model model,SearchCriteria cri) throws Exception{
		model.addAttribute("list",dao.list());
		//System.out.println(dao.list());
		return "/Hospital/search";
	}
	
	@RequestMapping("detail")
	public String detail(Model model,String h_code) throws Exception{
		model.addAttribute("vo",dao.read(h_code));
		//System.out.println(dao.read("1234567812"));
		return "/Hospital/detail";
	}
	
	@RequestMapping("reservation")
	public String reservation(){
		return "/Hospital/reservation";
	}
	
	/*     병원 리뷰 작성     */
	@ResponseBody
	@RequestMapping("reviewinsert")
	public void reviewinsert(ReviewVO vo) throws Exception{
		dao.reviewinsert(vo);
	}
	
	@Inject
	ReviewDAO rdao;
	
	/* 병원 리뷰 평점 병원에 저장 */
	@ResponseBody
	@RequestMapping("reviewlist")
	public List<MBasketHVO> reviewlist()throws Exception{
		return rdao.list();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
