package com._01._01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class ControllerMain {
	@RequestMapping("/sinhvien")	
	public String gethome() {
		return "index";
	}
}
