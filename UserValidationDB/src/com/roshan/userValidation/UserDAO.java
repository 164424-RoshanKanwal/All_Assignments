package com.roshan.userValidation;

import java.util.ArrayList;

public class UserDAO {

	
	static ArrayList<User> userList = new ArrayList<User>();
	
	static {
		userList.add(new User("Roshan", "Kanwal", "Admin"));
		userList.add(new User("ABC", "xys", "User"));
		userList.add(new User("Roshana", "Kanwald", "User"));
		userList.add(new User("ABCd", "xysd", "User"));
	}
	

	public String getUserT(String userName, String password){
		System.out.println(userName);
		int listLen = userList.size();
		System.out.println(listLen);
		String userType = "";
		for(int index=0; index< listLen ; index++){
			if(userName.equals(userList.get(index).getName()) && password.equals(userList.get(index).getPassword())){
			userType = userList.get(index).getUserType();	
			}
		}
		return userType;
	}
	
}
