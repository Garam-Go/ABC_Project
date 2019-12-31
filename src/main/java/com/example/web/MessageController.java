package com.example.web;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.MessageVO;
import com.example.domain.PageMaker;
import com.example.domain.SearchCriteria;
import com.example.persistence.MessageDAO;

@Controller
public class MessageController {
	@Inject
	MessageDAO msdao;
	
	//메세지 데이터를 가져옴
	@ResponseBody
	@RequestMapping("messagelist")
	public HashMap<String, Object> messagelist(SearchCriteria cri, String mid)throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();
		cri.setPerPageNum(10); //한 페이지에 보여줄 데이터 갯수
		
		PageMaker pm = new PageMaker(); //페이지에 관한 정보들
		pm.setCri(cri);
		
		pm.setTotalCount(10); //전체의 데이터를 임의로 몇개라고 지정해줌.
		
		hash.put("list", msdao.list(mid, cri));
		hash.put("pm", pm);
		return hash;
	}
	
	//메세지 보내면 DB에 삽입하는 구절
	@ResponseBody
	@RequestMapping(value="message",method=RequestMethod.POST)
	public void messagepost(MessageVO vo)throws Exception{
		msdao.insert(vo);
	}
}
