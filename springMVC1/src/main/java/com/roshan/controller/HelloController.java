package com.roshan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

	
	@RequestMapping(value="/logini")
	public String sayHello(Model model){
	
		return "hello";
	}
	
	
}
