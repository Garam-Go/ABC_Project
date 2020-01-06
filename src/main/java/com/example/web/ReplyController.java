package com.example.web;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Criteria;
import com.example.domain.PageMaker;
import com.example.domain.ReplyVO;
import com.example.persistence.ReplyDAO;

@Controller
@RequestMapping("medicine")
public class ReplyController {
	@Inject
	ReplyDAO rdao;
	
	@ResponseBody
	@RequestMapping("list")
	public Map<String, Object> list(Criteria cri, int medcode)throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		
		cri.setPerPageNum(5);
		PageMaker pm=new PageMaker();
		pm.setStartPage(1);
		pm.setCri(cri);
		
		map.put("list", rdao.list(cri, medcode));                                                                                    
		map.put("pm", pm);
		//System.out.println(rdao.list("5", "2122856"));
		return map;
	}
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public void insert(ReplyVO vo)throws Exception{
		rdao.insert(vo);
	}
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public void delete(int replyid, int medcode)throws Exception{
		rdao.delete(replyid, medcode);
	}
}
