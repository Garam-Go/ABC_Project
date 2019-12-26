package com.example.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.MedicineVO;
import com.example.domain.SearchCriteria;
import com.example.persistence.MedicineDAO;

@Controller
@RequestMapping("medicine")
public class MedicineController {
	@Inject
	MedicineDAO mdao;
	
	@RequestMapping("medicineMain")
	public String medicineMain(){
		return "/medicine/medicineMain";
	}
	@RequestMapping("medicineDes")
	public String medicineDes(){
		return "/medicine/medicineDes";
	}
	@RequestMapping("medicineSearchResult")
	public String medicineSearchResult(){
		return "/medicine/medicineSearchResult";
	}
	@ResponseBody
	@RequestMapping("medicine.json")
	public List<MedicineVO> mjson(SearchCriteria cri) throws Exception{
		return mdao.list(cri);
	}
	@ResponseBody
	@RequestMapping("insert")
	public void insert(MedicineVO vo) throws Exception{
		mdao.insert(vo);
		System.out.println(vo.toString());
	}
	
}

