package com.roshan.demo;

public class ThrowsKeywordUsage {

	
	public static int result(int num1, int num2){
		try{
	
	}catch(ArithmeticException e){
		System.out.println(e);
		
	}
		return num1/num2;}
	
	public static void main(String[] args) {
		
		System.out.println(result(10,4));
		
			
		
	}
	
}
