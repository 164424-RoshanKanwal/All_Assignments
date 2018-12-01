package com.roshan.practice;

public class PrivateAccess extends PersonPrivate{

	private void invoke(){
		System.out.println("Hello");
	}
	
	public static void main(String args[]){
        ;
      //  PersonPrivate p2 = new PersonPrivate("P2");
     
        System.out.println("wooh");
        
    }
	
}
