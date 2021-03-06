package com.roshan.validate;

import java.util.ArrayList;

public class UserDAO implements IUserDAO {

	ArrayList<User> userList = new ArrayList<User>();
	
	public UserDAO(){
		userList.add(new User("roshan","kanwal", "Admin"));
		userList.add(new User("sneha","asasas", "User"));
		userList.add(new User("parthi","parthi", "User"));
		userList.add(new User("urvi","patwa", "User"));
		
	}
	
	
	@Override
	public String getUserType(String username, String password) {
		int userListLen= userList.size();
		String userType ="";
		for(int index=0; index< userListLen; index++){
			
			if(username.equals(userList.get(index).getName()) && password.equals(userList.get(index).getPassword())){
				
				userType = userList.get(index).getUserType();
			}
			
		}
		return userType;
	}



	
	



	@Override
	public void addUser(User user) {
		
		userList.add(user);
	}



	@Override
	public void changePassword(String oldPassword, String newPassword) {
		
		
	}



	@Override
	public void removeUser(User user) {
		
		userList.remove(user);
	}
}
