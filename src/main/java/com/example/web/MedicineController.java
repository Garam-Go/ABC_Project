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
	
	//약검색 메인페이지로 이동
	@RequestMapping("medicineMain")
	public String medicineMain(){
		return "/Medicine/medicineMain";
	}
	//약검색한거 상세페이지
	@RequestMapping("medicineDes")
	public String medicineDes(int medcode, Model model) throws Exception{
		model.addAttribute("vo", Meddao.read(medcode));
		//System.out.println(mdao.read(medcode));
		return "/Medicine/medicineDes";
	}
	//약검색 결과창
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
	
	//검색하게끔 하자
	@ResponseBody
	@RequestMapping("medicine.json")
	public HashMap<String, Object> mlist(SearchCriteria cri) throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();//데이터 여러개를 한번에 불러가야되니까 hashmap사용
		cri.setPerPageNum(3);
		hash.put("list", Meddao.slist(cri)); //list라는 변수값에 dao실행한거 넣어줌
		hash.put("total", Meddao.stotal(cri));
		
		PageMaker pm = new PageMaker(); //pagemaker생성
		pm.setCri(cri);
		pm.setTotalCount(Meddao.stotal(cri));
		
		hash.put("pm", pm);
		return hash;
	}
	
	@ResponseBody
	@RequestMapping("insert")
	public void insert(MedicineVO vo) throws Exception{
		Meddao.insert(vo);
		System.out.println(vo.toString());
	}
	
	//마이리스트에 최근 본 약 저장
	@ResponseBody
	@RequestMapping("mminsert")
	public void mminsert(String mmid, int mmrecent) throws Exception{
		MBasketMVO vo = new MBasketMVO();
		vo.setMmid(mmid);
		vo.setMmrecent(mmrecent);
		mbmdao.mminsert(vo);
	}
}

