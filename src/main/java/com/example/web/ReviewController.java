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
	ReviewDAO dao;
	
	@Inject
	ReviewService service;
	
	
	@ResponseBody
	@RequestMapping("Hos-reviewinsert")
	public void review(ReviewVO vo)throws Exception{
		service.insert(vo);
	}
}
