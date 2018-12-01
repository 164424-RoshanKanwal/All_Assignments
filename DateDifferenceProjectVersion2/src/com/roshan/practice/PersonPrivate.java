package com.roshan.practice;

public abstract class PersonPrivate{
	
	static private String name;
  
	public PersonPrivate() {
		this.name = "roshan";
	}
	
	public PersonPrivate(String name) {
		
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
}
