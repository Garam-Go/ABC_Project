package com.example.web;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.MBasketMVO;
import com.example.domain.MedicineVO;
import com.example.domain.PageMaker;
import com.example.domain.SearchCriteria;
import com.example.persistence.MBMDAO;
import com.example.persistence.MedicineDAO;

@Controller
public class MedicineController {
	@Inject
	MedicineDAO Meddao;
	@Inject
	MBMDAO mbmdao;
<<<<<<< HEAD
	@Inject
	ReplyDAO repdao;
<<<<<<< HEAD
<<<<<<< HEAD
	
	//ºÎÆ®½ºÆ®·¦
	@RequestMapping("bmed_list")
	public String bmed_list(Model model, SearchCriteria cri)throws Exception{
		cri.setPerPageNum(3);
		PageMaker pm=new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(Meddao.total());
		model.addAttribute("pm",pm);
		model.addAttribute("list",Meddao.list(cri));
		return "/Medicine/bmed_list";
	}
	//ºÎÆ®½ºÆ®·¦ ¾à°Ë»öÇÑ°Å »ó¼¼ÆäÀÌÁö
	@RequestMapping("bmed_des")
	public String bmed_des(int medcode, Model model) throws Exception{
		model.addAttribute("vo", Meddao.read(medcode));
		//System.out.println(mdao.read(medcode));
		return "/Medicine/bmed_des";
	}
=======
>>>>>>> parent of e224e1a... Revert "ì•½ëŒ“ê¸€ ë„ìš°ê¸°"
=======
>>>>>>> parent of e224e1a... Revert "ì•½ëŒ“ê¸€ ë„ìš°ê¸°"
=======
>>>>>>> parent of 2d19357... ì•½ëŒ“ê¸€ ë„ìš°ê¸°
	
	//¾à°Ë»ö ¸ŞÀÎÆäÀÌÁö·Î ÀÌµ¿
	@RequestMapping("medicineMain")
	public String medicineMain(){
		return "/Medicine/medicineMain";
	}
	//¾à°Ë»öÇÑ°Å »ó¼¼ÆäÀÌÁö
	@RequestMapping("medicineDes")
	public String medicineDes(int medcode, Model model) throws Exception{
		model.addAttribute("vo", Meddao.read(medcode));
		//System.out.println(mdao.read(medcode));
		return "/Medicine/medicineDes";
	}
	//¾à°Ë»ö °á°úÃ¢
	@RequestMapping("medicineSearchResult")
	public String medicineSearchResult(Model model, SearchCriteria cri) throws Exception{
		cri.setPerPageNum(3);
		PageMaker pm=new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(Meddao.total());
		model.addAttribute("pm",pm);
		model.addAttribute("list",Meddao.list(cri));
		return "/Medicine/medicineSearchResult";
	}
	
	//°Ë»öÇÏ°Ô²û ÇÏÀÚ
	@ResponseBody
	@RequestMapping("medicine.json")
	public HashMap<String, Object> mlist(SearchCriteria cri) throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();//µ¥ÀÌÅÍ ¿©·¯°³¸¦ ÇÑ¹ø¿¡ ºÒ·¯°¡¾ßµÇ´Ï±î hashmap»ç¿ë
		cri.setPerPageNum(3);
		hash.put("list", Meddao.slist(cri)); //list¶ó´Â º¯¼ö°ª¿¡ dao½ÇÇàÇÑ°Å ³Ö¾îÁÜ
		hash.put("total", Meddao.stotal(cri));
		
		PageMaker pm = new PageMaker(); //pagemaker»ı¼º
		pm.setCri(cri);
		pm.setTotalCount(Meddao.stotal(cri));
		
		hash.put("pm", pm);
		return hash;
	}
	
	//¸¶ÀÌ¸®½ºÆ®¿¡ ÃÖ±Ù º» ¾à ÀúÀå
	@ResponseBody
	@RequestMapping("mminsert")
	public void mminsert(String mmid, int mmrecent) throws Exception{
		MBasketMVO vo = new MBasketMVO();
		vo.setMmid(mmid);
		vo.setMmrecent(mmrecent);
		mbmdao.mminsert(vo);
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	//¸¶ÀÌ¸®½ºÆ®¿¡¼­ ³»°¡ ¾´ ´ñ±Û ¸®½ºÆ®
		@ResponseBody
		@RequestMapping("mmlist")
		public HashMap<String, Object> mmlist(Criteria cri, String replyname)throws Exception{
			HashMap<String, Object> hash = new HashMap<String, Object>();
			cri.setPerPageNum(10);
			PageMaker pm=new PageMaker();
			pm.setCri(cri);
			pm.setTotalCount(repdao.mmtotal(replyname));
			hash.put("pm",pm);
			hash.put("list",repdao.mmlist(cri,replyname));
			return hash; 
		}
=======
=======
>>>>>>> parent of e224e1a... Revert "ì•½ëŒ“ê¸€ ë„ìš°ê¸°"
	
	//¸¶ÀÌ¸®½ºÆ®¿¡¼­ ³»°¡ ¾´ ´ñ±Û ¸®½ºÆ®
	@ResponseBody
	@RequestMapping("mmlist")
	public HashMap<String, Object> mmlist(Criteria cri, String replyname)throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();
		cri.setPerPageNum(10);
		PageMaker pm=new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(repdao.mmtotal(replyname));
		hash.put("pm",pm);
		hash.put("list",repdao.mmlist(cri,replyname));
		return hash; 
	}
<<<<<<< HEAD
>>>>>>> parent of e224e1a... Revert "ì•½ëŒ“ê¸€ ë„ìš°ê¸°"
=======
>>>>>>> parent of e224e1a... Revert "ì•½ëŒ“ê¸€ ë„ìš°ê¸°"
=======
>>>>>>> parent of 2d19357... ì•½ëŒ“ê¸€ ë„ìš°ê¸°
}

