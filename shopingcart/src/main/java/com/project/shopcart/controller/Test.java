package com.project.shopcart.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.shopcart.dao.ProductsDAOImpl;
import com.project.shopcart.dao.UserDAOImpl;
import com.project.shopcart.pojo.Products;
import com.project.shopcart.pojo.User;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springJdbc.xml");
		ProductsDAOImpl productsDAOImpl = context.getBean(ProductsDAOImpl.class);
		productsDAOImpl.add(new Products(1, "Bottle", 50, 30));
		productsDAOImpl.add(new Products(2, "Pen", 5, 100));
		productsDAOImpl.add(new Products(3, "Pan", 500, 100));
		productsDAOImpl.getallproducts();
		productsDAOImpl.remove(2);
		
		UserDAOImpl userDAOImpl = context.getBean(UserDAOImpl.class);
		userDAOImpl.add(new User(1, "Roshan", "ross@gmail.com", "kanwal", "1234567890", "Bangalore"));
		userDAOImpl.add(new User(2, "Birappa", "bir@gmail.com", "patil", "1234567890", "Solapur"));
		userDAOImpl.add(new User(3, "Mihir", "ms@gmail.com", "sawant", "1234567890", "Konkan"));
		userDAOImpl.getAllUsers();
		userDAOImpl.remove(1);
		
		context.close();
	}
	
}
