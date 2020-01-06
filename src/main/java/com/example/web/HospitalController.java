package com.example.web;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.HVO;
import com.example.domain.PageMaker;
import com.example.domain.SearchCriteria;
import com.example.persistence.HDAO;

@RequestMapping("Hospital")
@Controller
public class HospitalController {
	@Inject
	HDAO dao;
	/* main 페이지로 이동*/
	@RequestMapping("Hos-main")
	public String main(){
		PageMaker pm=new PageMaker();
		HashMap<String,Object> map= new HashMap<String,Object>();
		map.put("pm", pm);
		return "/Hospital/main";
	}
	
	/* search 페이지로 이동*/
	@RequestMapping("Hos-search")
	public String search(Model model,SearchCriteria cri) throws Exception{
		model.addAttribute("list",dao.list());
		//System.out.println(dao.list());
		return "/Hospital/search";
	}
	/* detail 페이지로 이동*/
	@RequestMapping("Hos-detail")
	public String detail(Model model,String h_code) throws Exception{
		model.addAttribute("vo",dao.read(h_code));
		//System.out.println(dao.read("1234567812"));
		return "/Hospital/detail";
	}
	/* reservation 페이지로 이동*/
	@RequestMapping("Hos-reservation")
	public String reservation(Model model,String h_code)throws Exception{
		model.addAttribute("vo",dao.read(h_code));
		return "/Hospital/reservation";
	}
	

		//main.jsp에서 사용
		//search.jsp에서 사용
		@ResponseBody
		@RequestMapping("Hos-slist.json")
		public List<HVO> slistjson(SearchCriteria cri) throws Exception{
			//System.out.println(dao.slist(cri));
			return	dao.slist(cri);
		}
	

	
	
}
