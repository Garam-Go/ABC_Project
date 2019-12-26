package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.HVO;
import com.example.domain.PageMaker;
import com.example.domain.SearchCriteria;
import com.example.persistence.FDAO;
import com.example.persistence.HDAO;
import com.example.persistence.QDAO;

@Controller
public class comuController {

	@Inject
	FDAO fdao;
	
	@Inject
	QDAO qdao;
	
	@Inject
	HDAO hdao;

	//자유게시판 이동
	@RequestMapping("comu_clist")
	public String comu_clist(Model model, SearchCriteria cri) throws Exception {
		cri.setPerPageNum(10);
		model.addAttribute("qlist", qdao.qlist(cri));
		return "community/main";
	}
	
	@ResponseBody
	@RequestMapping("clist.json")
	public Map<String, Object> clist(SearchCriteria cri) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		cri.setPerPageNum(10);
		PageMaker pm = new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(fdao.ctotal(cri));
		map.put("pm", pm);
		map.put("clist", fdao.clist(cri));
		
		return map;
	}
	
	//건강정보 크롤링
	@ResponseBody
	@RequestMapping("health.json")
	public List<HashMap<String,Object>> health() throws Exception{
		int i = 0;
		List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
		
		Document doc = Jsoup.connect("http://www.bosa.co.kr/news/articleList.html?view_type=sm").get();
		Elements es = doc.select("#side-scroll-in .BoxDefault_2");
		
		
			for(Element e:es.select(".auto-article")){
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("title", e.select(".dis-block").text());
			map.put("link", e.select("a").attr("href"));
			if(e.select(".dis-block").text().length()!=0 && i<5){
				list.add(map);
				i = i+1;
			}
		}
			return list;
	}
	
	//건강정보 페이지 이동
		@RequestMapping("comu_hlist")
		public String comu_hlist(Model model, SearchCriteria cri) throws Exception {
			cri.setPerPageNum(5);
			model.addAttribute("clist", fdao.clist(cri));
			return "community/hlist";
		}
		
		//건강정보 크롤링
		@ResponseBody
		@RequestMapping("healthlist.json")
		public HashMap<String,Object> healthlist(int page,String keyword) throws Exception{
			HashMap<String,Object> list = new HashMap<String,Object>();
			
			Document doc = Jsoup.connect("http://www.bosa.co.kr/news/articleList.html?page="+page+"&sc_section_code=&sc_sub_section_code=&sc_serial_code="
					+ "&sc_area=&sc_level=&sc_article_type=&sc_view_level=&sc_sdate=&sc_edate=&sc_serial_number=&sc_word="+keyword+"&sc_word2=&sc_andor=&"
					+ "sc_order_by=E&sc_edit=&view_type=sm").get();
			list.put("total", doc.select("#article-list tbody tr td table tbody tr td table tbody tr .user-head-title").text());
			
			Elements es = doc.select("#article-list tbody tr td table tbody");
			
			ArrayList<HVO> array = new ArrayList<HVO>();
			for(Element e:es.select("tr")){
				HVO vo = new HVO();
				vo.setTitle(e.select("td table tbody tr td table tbody tr .list-titles a").text());
				vo.setLink(e.select("td table tbody tr td table tbody tr .list-titles a").attr("href"));
				vo.setWdate(e.select("td table tbody tr td table tbody tr .list-times").text());
				if(e.select("td table tbody tr td table tbody tr .list-titles a").text().length()!=0 ){
					array.add(vo);
				}
			}
			list.put("hlist", array);
			
			return list;
		}
		
		
		//건강정보 DB에 집어 넣기
		@ResponseBody
		@RequestMapping(value="hinsert", method=RequestMethod.POST)
		public void hinsert(HVO vo) throws Exception{
			System.out.println(vo.toString());
			hdao.hinsert(vo);
		}
	
	//질문게시판 이동
	@RequestMapping("comu_qlist")
	public String comu_qlist(Model model, SearchCriteria cri) throws Exception {
		PageMaker pm = new PageMaker(); // 페이지에 관한 정보들
		cri.setPerPageNum(10);
		pm.setCri(cri);

		pm.setTotalCount(qdao.qtotal(cri)); // 전체의 데이터를 임의로 몇개라고 지정해줌.
		
		model.addAttribute("qlist", qdao.qlist(cri));
		model.addAttribute("pm", pm);
		return "community/qlist";
	}
}
