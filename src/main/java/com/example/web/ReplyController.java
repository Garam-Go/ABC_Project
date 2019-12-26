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
public class ReplyController {
	@Inject
	ReplyDAO rdao;
	
	@ResponseBody
	@RequestMapping("list")
	public Map<String, Object> list(Criteria cri, int boardid)throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		
		cri.setPerPageNum(5);
		PageMaker pm=new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(rdao.total(boardid));
		
		map.put("list", rdao.list(cri, boardid));                                                                                    
		map.put("pm", pm);
		return map;
	}
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public void insert(ReplyVO vo)throws Exception{
		rdao.insert(vo);
	}
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public void delete(int replyid)throws Exception{
		rdao.delete(replyid);
	}
}
