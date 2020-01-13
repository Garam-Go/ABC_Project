package com.example.web;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.domain.FVO;
import com.example.domain.HealVO;
import com.example.domain.HosReplyVO;
import com.example.domain.HosVO;
import com.example.domain.PageMaker;
import com.example.domain.QVO;
import com.example.domain.ReplyVO;
import com.example.domain.SearchCriteria;
import com.example.persistence.FDAO;
import com.example.persistence.HealDAO;
import com.example.persistence.HosDAO;
import com.example.persistence.HosReplyDAO;
import com.example.persistence.HsearchDAO;
import com.example.persistence.QDAO;
import com.example.persistence.ReplyDAO;

@Controller
public class comuController {

	@Inject
	FDAO fdao;
	
	@Inject
	QDAO qdao;
	
	@Inject
	HealDAO hdao;
	
	@Inject
	HosDAO hosdao;
	
	@Inject
	HsearchDAO hsearchdao;

	@Inject
	ReplyDAO rdao;
	
	@Inject
	HosReplyDAO hrdao;
	
	//占쏙옙占쏙옙占쌉쏙옙占쏙옙 占싱듸옙
	@RequestMapping("comu_clist")
	public String comu_clist(Model model, SearchCriteria cri) throws Exception {
		cri.setPerPageNum(5);
		model.addAttribute("qlist", qdao.qlist(cri));
		return "/community/main";
	}
	
	//占쏙옙占쏙옙占쌉쏙옙占쏙옙 占쏙옙占쏙옙
	@ResponseBody
	@RequestMapping("clist.json")
	public Map<String, Object> clist(SearchCriteria cri) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		cri.setPerPageNum(20);
		PageMaker pm = new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(fdao.ctotal(cri));
		map.put("pm", pm);
		map.put("clist", fdao.clist(cri));
		
		return map;
	}
	
	//占실곤옙占쏙옙占쏙옙 크占싼몌옙
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
	
	//占실곤옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占싱듸옙
		@RequestMapping("comu_hlist")
	public String comu_hlist(Model model, SearchCriteria cri) throws Exception {
			cri.setPerPageNum(5);
			model.addAttribute("clist", fdao.clist(cri));
			model.addAttribute("qlist", qdao.qlist(cri));
			return "community/hlist";
		}
		
	//占실곤옙占쏙옙占쏙옙 크占싼몌옙
	@ResponseBody
	@RequestMapping("healthlist.json")
	public HashMap<String,Object> healthlist(int page,String keyword) throws Exception{
			HashMap<String,Object> list = new HashMap<String,Object>();
			
			Document doc = Jsoup.connect("http://www.bosa.co.kr/news/articleList.html?page="+page+"&sc_section_code=&sc_sub_section_code=&sc_serial_code="
					+ "&sc_area=&sc_level=&sc_article_type=&sc_view_level=&sc_sdate=&sc_edate=&sc_serial_number=&sc_word="+keyword+"&sc_word2=&sc_andor=&"
					+ "sc_order_by=E&sc_edit=&view_type=sm").get();
			list.put("total", doc.select("#article-list tbody tr td table tbody tr td table tbody tr .user-head-title").text());
			
			Elements es = doc.select("#article-list tbody tr td table tbody");
			
			ArrayList<HealVO> array = new ArrayList<HealVO>();
			for(Element e:es.select("tr")){
				HealVO vo = new HealVO();
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
			
	//占실곤옙占쏙옙占쏙옙 DB占쏙옙 占쏙옙占쏙옙 占쌍깍옙
	@ResponseBody
	@RequestMapping(value="hinsert", method=RequestMethod.POST)
	public void hinsert(HealVO vo) throws Exception{
		System.out.println(vo.toString());
		hdao.hinsert(vo);
	}

	//占쏙옙占쏙옙占쌉쏙옙占쏙옙 占싱듸옙
	@RequestMapping("comu_qlist")
	public String comu_qlist(Model model, SearchCriteria cri) throws Exception {
		PageMaker pm = new PageMaker(); // 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙
		cri.setPerPageNum(5);
		pm.setCri(cri);

		pm.setTotalCount(qdao.qtotal(cri)); // 占쏙옙체占쏙옙 占쏙옙占쏙옙占싶몌옙 占쏙옙占실뤄옙 占쏘개占쏙옙占� 占쏙옙占쏙옙占쏙옙占쏙옙.
		
		model.addAttribute("qlist", qdao.qlist(cri));
		model.addAttribute("clist", fdao.clist(cri));
		model.addAttribute("pm", pm);
		return "/community/qlist";
	}
	
	//占쏙옙占쏙옙占쌉쏙옙占쏙옙 占쏙옙占쏙옙
	@ResponseBody
	@RequestMapping("qlist.json")
	public Map<String, Object> qlist(SearchCriteria cri) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		cri.setPerPageNum(20);
		PageMaker pm = new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(qdao.qtotal(cri));
		map.put("pm", pm);
		map.put("clist", qdao.qlist(cri));
		
		return map;
	}
	
	//占쏙옙占쏙옙 占쏙옙占쏙옙트 占쏙옙占쏙옙占쏙옙
	@ResponseBody
	@RequestMapping("community.json")
	public Map<String, Object> comulist(SearchCriteria cri) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		cri.setPerPageNum(10);
		PageMaker pm = new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(hsearchdao.htotal(cri));
		map.put("pm", pm);
		map.put("hlist", hsearchdao.hlist(cri));
		return map;
	}
	
	//커占승댐옙티 占쏙옙占쏙옙占쏙옙 占싱듸옙
	@RequestMapping("comu_community")
	public String comu_community() throws Exception {
		return "community/community";
	}
	
	//占쏙옙占쏙옙占쏙옙占쌉쏙옙占쏙옙 占쏙옙占쏙옙트 占쏙옙占쏙옙占쏙옙
	@ResponseBody
	@RequestMapping("comu_community.json")
	public Map<String, Object> comu_communityJson(String type, String hcode,SearchCriteria cri) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		cri.setPerPageNum(10);
		PageMaker pm = new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(hosdao.total(type,hcode,cri));
		map.put("pm", pm);
		map.put("hoslist", hosdao.list(type,hcode,cri));
		return map;
	}
	
	//占쌜억옙占쏙옙
	@RequestMapping("comu_insert")
	public String comu_insert() throws Exception {
		return "community/comInsert";
	}
	
	//占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙
	@RequestMapping("comu_detailListFree")
	public String comu_detailListFree(int id, Model model) throws Exception {
		model.addAttribute("vo",fdao.cread(id));
		return "community/comDetail";
	}
	
	//replyList
	@ResponseBody
	@RequestMapping("replyList.json")
	public List<ReplyVO> replyList_json(int pid) throws Exception{
		return rdao.clist(pid);
	}
	
	//replyInsert
	@ResponseBody
	@RequestMapping("freereplyinsert.json")
	public void freereplyinsert_json(ReplyVO vo) throws Exception{
		rdao.Finsert(vo);
	}
	
	//占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙
	@RequestMapping("comu_detailListQuery")
	public String comu_detailListQuery(int id, Model model) throws Exception {
		model.addAttribute("vo",qdao.qread(id));
		return "community/comDetailQuery";
	}
	
	//replyList
	@ResponseBody
	@RequestMapping("replyListQuery.json")
	public List<ReplyVO> replyListQuery_json(int pid) throws Exception{
		return rdao.qlist(pid);
	}
	
	//replyInsert
	@ResponseBody
	@RequestMapping("queryreplyinsert.json")
	public void queryreplyinsert_json(ReplyVO vo) throws Exception{
		rdao.Qinsert(vo);
	}
	
	//占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙
		@RequestMapping("comu_detailListComu")
	public String comu_detailListComu(int id,String hcode, Model model) throws Exception {
		model.addAttribute("vo",hosdao.hread(id,hcode));
		return "community/comDetailComu";
	}
	
	//replyList
	@ResponseBody
	@RequestMapping("replyListComu.json")
	public List<ReplyVO> replyListComu_json(int pid, String hcode) throws Exception{
		return hrdao.hlist(pid,hcode);
	}
	
	//replyInsert
	@ResponseBody
	@RequestMapping("Comureplyinsert.json")
	public void Comureplyinsert_json(HosReplyVO vo) throws Exception{
			hrdao.Hinsert(vo);
	}
	
	@Resource(name = "uploadPath")
	private String path;
	

	@RequestMapping(value = "insertComu", method = RequestMethod.POST)
	public String insertPostCom(HosVO vo, String hname, MultipartFile file1) throws Exception {
		System.out.println(vo.toString());
		if (file1.getOriginalFilename() != "") {
			// 占쏙옙占싸듸옙
			UUID uid = UUID.randomUUID();
			String savedName = uid.toString() + "_" + file1.getOriginalFilename();
			File target = new File(path, savedName);
			FileCopyUtils.copy(file1.getBytes(), target);
 
			vo.setImage(savedName);
		}
		
		hosdao.insert(vo);

		return "redirect:comu_community?h_code="+vo.getHcode()+"&h_name="+hname;
	}
	
	@RequestMapping(value = "insertfree", method = RequestMethod.POST)
	public String insertPostFree(FVO vo, MultipartFile file1) throws Exception {
		// 占쏙옙占쏙옙占쏙옙 占싱몌옙占쏙옙 占쌍다몌옙 if占쏙옙 占쏙옙占쏙옙
		if (file1.getOriginalFilename() != "") {
			// 占쏙옙占싸듸옙
			UUID uid = UUID.randomUUID();
			String savedName = uid.toString() + "_" + file1.getOriginalFilename();
			File target = new File(path, savedName);
			FileCopyUtils.copy(file1.getBytes(), target);
 
			vo.setImage(savedName);
		}
		System.out.println(vo.toString());

		fdao.insert(vo);

		return "redirect:comu_clist";
	}
	
	@RequestMapping(value = "insertquery", method = RequestMethod.POST)
	public String insertPostQuery(QVO vo, MultipartFile file1) throws Exception {
		// 占쏙옙占쏙옙占쏙옙 占싱몌옙占쏙옙 占쌍다몌옙 if占쏙옙 占쏙옙占쏙옙
		if (file1.getOriginalFilename() != "") {
			// 占쏙옙占싸듸옙
			UUID uid = UUID.randomUUID();
			String savedName = uid.toString() + "_" + file1.getOriginalFilename();
			File target = new File(path, savedName);
			FileCopyUtils.copy(file1.getBytes(), target);
 
			vo.setImage(savedName);
		}
		System.out.println(vo.toString());

		qdao.insert(vo);

		return "redirect:comu_qlist";
	}
	
}
