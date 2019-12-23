package com.example.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.persistence.FDAO;

@Controller
public class comuController {
	
	@Inject
	FDAO dao;
	
	@RequestMapping("comu_clist")
	public String comu_clist(Model model) throws Exception{
		model.addAttribute("clist",dao.clist());
		return "community/main";
	}
	
}
