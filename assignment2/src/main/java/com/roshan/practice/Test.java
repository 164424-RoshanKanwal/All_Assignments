package com.roshan.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("springCons.xml");
		
		ConstructorInjectionUsingApplicationContext t = (ConstructorInjectionUsingApplicationContext)con.getBean("constructor");
		System.out.println(t.roshan);
	}
	
}
