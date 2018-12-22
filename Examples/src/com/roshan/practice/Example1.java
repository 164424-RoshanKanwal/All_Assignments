package com.roshan.practice;

public class Example1 {
	
	public static String callMethod(){
		try{
			System.out.println("Hello Try");
			return "Hello Bro";
			}
		finally{
			System.out.println("hello");
			
		}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(callMethod());
		
		}
	}
	
	

