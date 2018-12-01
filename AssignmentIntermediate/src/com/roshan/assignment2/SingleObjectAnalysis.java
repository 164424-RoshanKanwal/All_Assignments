package com.roshan.assignment2;

public class SingleObjectAnalysis {

	public static void main(String[] args) {
		SingletonClass soa = SingletonClass.getInstance();
		SingletonClass soa2 = SingletonClass.getInstance();
		
		System.out.println(soa.hashCode());
		
		System.out.println(soa2.hashCode());
	}
}
