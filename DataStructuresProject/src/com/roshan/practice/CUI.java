package com.roshan.practice;

import java.util.Scanner;

public class CUI {
	
	static String[] userName = {"Roshan", "Rohit", "Kalu", "Ross"};
	static String[] password = {"Roshan123", "you", "yoyo", "cool"};
	
	
	public static void main(String[] args) {
		validate();
	}
	
	public static void validate(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Id");
		int id = scan.nextInt();
		int count=0, count2=0;
		
		while(count < 3){
			
		System.out.println("Enter username");
		String name = scan.next();
		if(name.equals(userName[id])){
			
			while(count2<3){
			System.out.println("Enter Password");
			String pwd = scan.next();
			
			if(pwd.equals(password[id])){
				System.out.println("Access Granted");
				break;
			}
			else{
				System.out.println("ENTER VALID PASSWORD!!!");
				count2++;
				} }
			break;
		}
		
		else{
			System.out.println("ENTER VALID DATA");
			
		}
		count++;
		}
		scan.close();
		
	}

}
