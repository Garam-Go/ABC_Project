package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("AdminMain")
	public String main(){
		return "/Admin/AdminMain";
	}
}
