package com.roshan.practice;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = scan.nextLine();
		System.out.println(s);
		
		System.out.println("Enter a number");
		int number = scan.nextInt();
		System.out.println(number);
		

		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println(num);
		scan.close();
	}

}
