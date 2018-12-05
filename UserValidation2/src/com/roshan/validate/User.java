package com.roshan.validate;

public class User {
private String name;
private String password;
private String userType;

public User(String name, String password, String userType) {
	super();
	this.name = name;
	this.password = password;
	this.userType = userType;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

@Override
public String toString() {
	return "User [name=" + name + ", password=" + password + ", userType="
			+ userType + "]";
}

public User() {
	super();
}


}
