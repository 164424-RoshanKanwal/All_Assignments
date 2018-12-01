package com.roshan.date;

public class StringCheck {

	public static void main(String[] args) {
		
	String s = "hello";
	String ss = "hello";
	String sss = "Hello";
	System.out.println(s.compareTo(ss));
	System.out.println(s.equals(ss));
	
	System.out.println(sss.compareTo(ss));
	System.out.println(s.equals(sss));
	}
	
}
