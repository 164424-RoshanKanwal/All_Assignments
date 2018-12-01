package com.roshan.practice;

public class MyExperimentsWithPrivate {  //MyExperimentsWithPrivate

	private int number;
	
	



	public static void main(String[] args) {
	/*	MyExperimentsWithPrivate my1 = new MyExperimentsWithPrivate();
		my1.number = 1333;		//static variable once changed by an object are changed 
		System.out.println(my1.number);//for every one of the objects....
		
		MyExperimentsWithPrivate my2 = new MyExperimentsWithPrivate();
		System.out.println(my2.number);*/
		
		MyExperimentsWithPrivate my1 = new MyExperimentsWithPrivate();
		my1.number = 1333;		//class variable or instance variable are initialized
		System.out.println(my1.number);//for every objects
		
		MyExperimentsWithPrivate my2 = new MyExperimentsWithPrivate();
		System.out.println(my2.number);
		
	}
	
}
