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
import com.example.domain.SearchCriteria;
import com.example.persistence.HDAO;
import com.example.persistence.MBHDAO;

@Controller
public class HospitalController {
	@Inject
	HDAO Hdao;
	
	@Inject
	MBHDAO mbhdao;
	
	/* 부트스트랩 */
	@RequestMapping("Hos-bmain")
	public String bmain(String query,Model model){
		model.addAttribute("query",query);
		return "/Hospital/Bmain";
	}
	/* 부트스트랩 */
	@RequestMapping("Hos-bsearch")
	public String bsearch(){
		return "/Hospital/Bsearch";
	}
	/* 부트스트랩 */
	@RequestMapping("Hos-bdetail")
	public String bdetail(Model model,String h_code) throws Exception{
		model.addAttribute("vo",Hdao.read(h_code));
		return "/Hospital/Bdetail";
	}
	
	
	
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
		model.addAttribute("list",Hdao.list());
		//System.out.println(dao.list());
		return "/Hospital/search";
	}
	/* detail 페이지로 이동*/
	@RequestMapping("Hos-detail")
	public String detail(Model model,String h_code) throws Exception{
		model.addAttribute("vo",Hdao.read(h_code));
		//System.out.println(dao.read("1234567812"));
		return "/Hospital/detail";
	}
	
	/* reservation 페이지로 이동*/
	@RequestMapping("Hos-reservation")
	public String reservation(Model model,String h_code)throws Exception{
		model.addAttribute("vo",Hdao.read(h_code));
		return "/Hospital/reservation";
	}

	




	//main.jsp에서 사용
	//search.jsp에서 사용
	@ResponseBody
	@RequestMapping("Hos-slist.json")
	public List<HVO> slistjson(SearchCriteria cri) throws Exception{
		//System.out.println(dao.slist(cri));
		return	Hdao.slist(cri);
	}
	
	//병원을 클릭하면 클릭한 병원의 정보가 저장
	@ResponseBody
	@RequestMapping("mhinsert")
	public void mhinsert(String mhid, String mhrecent) throws Exception{
		MBasketHVO vo = new MBasketHVO();
		vo.setMhid(mhid);
		vo.setMhrecent(mhrecent);
		mbhdao.insert(vo);
	}
	
}
