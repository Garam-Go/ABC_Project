package com.example.web;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.GradeVO;
import com.example.domain.HVO;
import com.example.domain.PageMaker;
import com.example.domain.ReviewVO;
import com.example.domain.SearchCriteria;
import com.example.persistence.HDAO;
import com.example.service.ReviewService;

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
			return	dao.slist(cri);
		}
		
	
		
		/*리뷰 컨트롤러*/
	

		
		
		
		/* 부트스트랩 확인용 */
		@RequestMapping("Hos-index")
		public String index(){
			return "/Hospital/index";
		}
		@RequestMapping("Hos-mainhtml")
		public String mainhtml(){
			return "/Hospital/mainhtml";
		}
		@RequestMapping("Hos-detailhtml")
		public String detailhtml(){
			return "/Hospital/detailhtml";
		}
		
		/*부트스트랩으로 */
		/* css구성 */
		/* dmain */
		@RequestMapping("Hos-dmain")
		public String dmain(){
			return "/Hospital/theme/dmain";
		}
		/* ddmain.template */
		@RequestMapping("Hos-dmainhtml")
		public String dmainhtml()throws Exception{
			return "/Hospital/template/dmainhtml";
		}
		
		/* dsearch */
		@RequestMapping("Hos-dsearch")
		public String dsearch(){
			return "/Hospital/theme/dsearch";
		}
		/* dsearch template */
		@RequestMapping("Hos-dsearchhtml")
		public String dsearchhtml(){
			return "/Hospital/template/dsearchhtml";
		}
		/* ddetail*/
		@RequestMapping("Hos-ddetail")
		public String ddetail(Model model,String h_code)throws Exception{
			model.addAttribute("vo",dao.read(h_code));
			return "/Hospital/theme/ddetail";
		}
		/* detail template */
		@RequestMapping("Hos-ddetailhtml")
		public String ddetailhtml(Model model,String h_code)throws Exception{
			model.addAttribute("vo",dao.read(h_code));
			return "/Hospital/template/ddetailhtml";
		}
	
	
}
