package com.roshan.date;

public class CheckFloat {

	public void check(int a, float f){
		
		System.out.println("Int float");
		
	}
	public void check(float f, int a){
		
		System.out.println("float Int");
		
	}
	
	public static void main(String[] args) {
		CheckFloat t = new CheckFloat();
		t.check(10.5f, 10);
		t.check(10, 10.5f);
		t.check(10, 10f);
		
		
		
	}
	
}
