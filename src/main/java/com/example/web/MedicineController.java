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
	
	//��˻� ������������ �̵�
	@RequestMapping("medicineMain")
	public String medicineMain(){
		return "/Medicine/medicineMain";
	}
	//��˻��Ѱ� ��������
	@RequestMapping("medicineDes")
	public String medicineDes(int medcode, Model model) throws Exception{
		model.addAttribute("vo", Meddao.read(medcode));
		//System.out.println(mdao.read(medcode));
		return "/Medicine/medicineDes";
	}
	//��˻� ���â
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
	
	//�˻��ϰԲ� ����
	@ResponseBody
	@RequestMapping("medicine.json")
	public HashMap<String, Object> mlist(SearchCriteria cri) throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();//������ �������� �ѹ��� �ҷ����ߵǴϱ� hashmap���
		cri.setPerPageNum(3);
		hash.put("list", Meddao.slist(cri)); //list��� �������� dao�����Ѱ� �־���
		hash.put("total", Meddao.stotal(cri));
		
		PageMaker pm = new PageMaker(); //pagemaker����
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
	
	//���̸���Ʈ�� �ֱ� �� �� ����
	@ResponseBody
	@RequestMapping("mminsert")
	public void mminsert(String mmid, int mmrecent) throws Exception{
		MBasketMVO vo = new MBasketMVO();
		vo.setMmid(mmid);
		vo.setMmrecent(mmrecent);
		mbmdao.mminsert(vo);
	}
}

