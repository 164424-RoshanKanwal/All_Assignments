package com.roshan.validate;

public interface IUserDAO {

	public String getUserType(String userName, String password);
	public void addUser(User user);
	public void changePassword(String oldPassword , String newPassword);
	public void removeUser(User user);
	
}
