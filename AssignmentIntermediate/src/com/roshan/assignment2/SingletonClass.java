package com.roshan.assignment2;

public final class SingletonClass {

	private SingletonClass(){
		
	}
	
	private static SingletonClass sc = null;
	
	public static SingletonClass getInstance(){
		sc = new SingletonClass();
		if (sc == null){
			return sc;
			}
		else {
			return sc;
		}}
		
	}
	

