package com.example.web;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.HVO;
import com.example.domain.PageMaker;
import com.example.domain.ReviewVO;
import com.example.domain.SearchCriteria;
import com.example.persistence.MBHDAO;
import com.example.persistence.ReviewDAO;
import com.example.service.ReviewService;

@Controller
public class ReviewController {
	
	@Inject
	ReviewDAO Revdao;
	
	@Inject
	MBHDAO mbhdao;
	
	@Inject
	ReviewService Revservice;
	
	//리뷰 입력
	@ResponseBody
	@RequestMapping("Hos-reviewinsert")
	public void review(ReviewVO vo)throws Exception{
		Revdao.insert(vo);
	}
	
	//리뷰출력
	@ResponseBody
	@RequestMapping("revlist")
	public List<ReviewVO> list(String hcode) throws Exception{
		return Revdao.rlist(hcode);
	}
	
	//마이페이지용 리뷰리스트 출력
	@ResponseBody
	@RequestMapping("Hos-reviewlist")
	public HashMap<String, Object> revlist(String hrevmyid,SearchCriteria cri) throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();
		cri.setPerPageNum(10); //한 페이지에 보여줄 데이터 갯수
		PageMaker pm = new PageMaker(); //페이지에 관한 정보들
		pm.setCri(cri);
		pm.setTotalCount(Revdao.total(hrevmyid));
	
		List<ReviewVO> rlist = Revdao.list(hrevmyid, cri);
		int size = rlist.size();
		//System.out.println(size);
		
		//저장된 리뷰의 병원 불러오기
		ArrayList<HVO> array = new ArrayList<HVO>();
		for(int i=0; i<size;i++){
			HVO vo = new HVO();
			vo = mbhdao.hread(rlist.get(i).getH_hcode().toString());
			array.add(vo);
		}
		//하나의 값으로 담아줌
		HashMap<String, Object> haslist = new HashMap<String, Object>();
		haslist.put("list", Revdao.list(hrevmyid, cri));
		haslist.put("rev", array);
		
		//System.out.println(array.toString());
		//hash.put("rev", array);
		hash.put("list", Revdao.list(hrevmyid, cri));
		hash.put("pm", pm);
		return hash;
	}
}
