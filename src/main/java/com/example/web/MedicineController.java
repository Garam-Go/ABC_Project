package com.example.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.MedicineVO;
import com.example.domain.PageMaker;
import com.example.domain.SearchCriteria;
import com.example.persistence.MedicineDAO;

@Controller
public class MedicineController {
	@Inject
	MedicineDAO Meddao;
	
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
		cri.setPerPageNum(10);
		PageMaker pm=new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(Meddao.total());
		model.addAttribute("pm",pm);
		model.addAttribute("list",Meddao.list(cri));
		return "/Medicine/medicineSearchResult";
	}
	@ResponseBody
	@RequestMapping("medicine.json")
	public List<MedicineVO> mlist(SearchCriteria cri) throws Exception{
		return Meddao.list(cri);
	}
	@ResponseBody
	@RequestMapping("insert")
	public void insert(MedicineVO vo) throws Exception{
		Meddao.insert(vo);
		System.out.println(vo.toString());
	}
	
}

