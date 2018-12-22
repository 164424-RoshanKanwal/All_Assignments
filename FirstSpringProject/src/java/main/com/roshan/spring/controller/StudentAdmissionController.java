package com.roshan.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/AdmissionPage")
	public String getAdmissionPage(){
		
		return "admission";
	}
}
