package com.example.web;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.ReviewVO;
import com.example.persistence.ReviewDAO;
import com.example.service.ReviewService;

@Controller
public class ReviewController {
	
	@Inject
	ReviewDAO Revdao;
	
	@Inject
	ReviewService Revservice;
	
	
	@ResponseBody
	@RequestMapping("Hos-reviewinsert")
	public void review(ReviewVO vo)throws Exception{
		Revservice.insert(vo);
	}
}
