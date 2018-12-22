package com.springJdbc.JdbcEx.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springJdbc.JdbcEx.allDAO.UserDAO;
import com.springJdbc.JdbcEx.pojo.User;

public class JdbcController {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springJdbc.xml");
		UserDAO userDAO = context.getBean(UserDAO.class);
		userDAO.addNewUser(new User(1, "Roshan", "kanwal"));
		
		context.close();
	}
}
