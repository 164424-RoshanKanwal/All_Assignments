package com.roshan.error;

public class StackOverFlowError {

	public static void main(String[] args) {
		
		System.out.println(throwStackOverFlowError(1));
	}

	private static int throwStackOverFlowError(int i) {
		System.out.println(i);
		if(i == 0){
			return 0;
		}
		else {
			return throwStackOverFlowError(i++);
		}
	}
	
	
}
