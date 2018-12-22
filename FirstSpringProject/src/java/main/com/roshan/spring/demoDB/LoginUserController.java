package com.roshan.spring.demoDB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginUserController {

	@RequestMapping("/login")
	public String userLoginMethod(){
		return "login";
	}
	
	
}
