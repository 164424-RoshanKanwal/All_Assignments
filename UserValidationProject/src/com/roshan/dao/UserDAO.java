package com.roshan.dao;

import java.util.ArrayList;

import com.roshan.pojo.User;

public class UserDAO {//DAO - Data Access Object

	ArrayList<User> userList ;
	
	public UserDAO(){
		userList = new ArrayList<User>();
		userList.add(new User("Onkar", "java", "Admin"));
		userList.add(new User("Roshan", "javae", "User"));
		userList.add(new User("Rakesh", "javac", "Admin"));
	}
	
	
	public String getUserType(String userName, String password){
	/* userList.stream()
		.filter(user-> user.getUserName().equals(userName) && user.getPassword().equals(password))
		.map(user-> user.getUserType());
		
	 
	 return "";*/
		
		for(User user : userList){
			if (userName.equals(user.getUserName()) && password.equals(user.getPassword())){
				
				return user.getUserType();
			}
			
				
			}
		throw new InvalidUserException("Username is invalid");
	}
}
