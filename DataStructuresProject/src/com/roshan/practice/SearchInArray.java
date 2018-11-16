package com.roshan.practice;

import java.util.Scanner;

public class SearchInArray {
public static void main(String[] args) {
	System.out.println("Enter a number to check");
	Scanner scan = new Scanner(System.in);
	int[] myArray = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
	int myArrayLen = myArray.length;
	int num = scan.nextInt();
	int index, result = 0;
	for (index = 0; index<myArrayLen; index++){
	if(num == myArray[index]){
		result = myArray[index];
		break;
	}
	}
	
	if (result == num){
		System.out.println("The number "+ num +" is available in the array");
	}
	else{
		System.out.println("The number "+ num +" is not available in the array");
	}
scan.close();
}
}
