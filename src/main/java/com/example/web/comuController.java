package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class comuController {
	
	@RequestMapping("comu-clist")
	public String comu_clist() throws Exception{
		return "main";
	}
	
}
