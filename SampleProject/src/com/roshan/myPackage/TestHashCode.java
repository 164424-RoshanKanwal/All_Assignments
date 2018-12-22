package com.roshan.myPackage;

public class TestHashCode {

	String name;
	Integer id;
	
	public TestHashCode(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	 
	public static void main(String[] args) {
		TestHashCode test = new TestHashCode(new String("Roshan"), new Integer(34));
		test.name.hashCode();
	}
	
	
	
}
