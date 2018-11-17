package com.roshan.assignment1;

import java.util.Scanner;

public class CheckArmstrongNumber {

	static int num, numlen;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Check the Armstrong Number Here!!");
		System.out.println("Enter a number!!");

		String number = scan.nextLine();
		num = Integer.parseInt(number);
		numlen = number.length();
		
		
		
		checkArmstrong(num, numlen);

		/*while(num != 0){
			int remainder = num%10;
			result += Math.pow(remainder, numlen);
			num=num/10;
		}

		if ( copy == result){
			System.out.println("The entered number " + number + " is Armstrong Number");

		}
		else {
			System.out.println("The entered number " + number + " is not Armstrong Number");

		}*/

		scan.close();
	}
	public static void checkArmstrong(int num, int numlen){
		int result = 0;
		int copy = num;
		
		while(num != 0){
			int remainder = num%10;
			result += Math.pow(remainder, numlen);
			num=num/10;
		}

		if ( copy == result){
			System.out.println("The entered number " + copy + " is Armstrong Number");

		}
		//else {
			//System.out.println("The entered number " + copy + " is not Armstrong Number");

		//}
		
	}

}


