package com.lianbiao.m4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	//到页面
	@RequestMapping("index")
	public String index() {
		
		return "index";
	}
}
