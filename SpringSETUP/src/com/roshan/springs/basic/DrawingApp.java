package com.roshan.springs.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.getPoint();
		
		((AbstractApplicationContext) context).close();
	}
	
}
