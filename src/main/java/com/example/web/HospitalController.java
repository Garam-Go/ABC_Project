package com.example.web;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.HVO;
import com.example.domain.PageMaker;
import com.example.domain.SearchCriteria;
import com.example.persistence.HDAO;

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
	
	@ResponseBody
	@RequestMapping("insert.json")
	public void insertjson(HVO vo) throws Exception{
		 dao.insert(vo);
	}
	
	@ResponseBody
	@RequestMapping("list.json")
	public List<HVO> listjson() throws Exception{
		 return	dao.list(); 
	}
	
	@ResponseBody
	@RequestMapping("slist.json")
	public List<HVO> slistjson(SearchCriteria cri) throws Exception{
		System.out.println(dao.slist(cri));
		return	dao.slist(cri); 
		
	}
	
	@ResponseBody
	@RequestMapping("read.json")
	public HVO readjson(String h_code) throws Exception{
		System.out.println(dao.read(h_code));
		return	dao.read(h_code); 
		
	}
	
	
	@RequestMapping("search")
	public String search(){
		return "/Hospital/search";
	}
	
	@RequestMapping("detail")
	public String detail(){
		return "/Hospital/detail";
	}
	
	@RequestMapping("reservation")
	public String reservation(){
		return "/Hospital/reservation";
	}
}
