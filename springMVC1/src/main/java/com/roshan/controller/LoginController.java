package com.roshan.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roshan.dao.ListOfAllUsers;

@Controller
public class LoginController {


	ListOfAllUsers list;
	
	
	@RequestMapping(value ="/login")
	public String userLoggedIn(){
	
		return "login";
	}
	
	

}
