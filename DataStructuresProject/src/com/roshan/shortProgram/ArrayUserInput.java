package com.roshan.shortProgram;

import java.util.Scanner;

public class ArrayUserInput {


	public static void main(String[] args) {
		System.out.println("Get Ascending or Descending.");
		System.out.println("How many numbers will you be giving as input.");
		Scanner scan = new Scanner(System.in);
		int totalNumbers = scan.nextInt();

		int myArray[] = new int[totalNumbers];
		int myArrayLen = myArray.length;


		for(int indexArray = 0; indexArray < myArrayLen; indexArray++){
			System.out.println("Enter number " + (indexArray+1));
			int numscan= scan.nextInt();
			myArray[indexArray] = numscan;
		}	


		for(int indexArray = 0; indexArray < myArrayLen; indexArray++){
			System.out.print(myArray[indexArray] + " ");
		}	
		
		ascOrder(myArray, myArrayLen);
	
		scan.close();	}

	public static void ascOrder(int[] myArray, int myArrayLen){
		int temp;
		for(int index = 0; index < myArrayLen; index++){
			for (int indexIn = index+1; indexIn < myArrayLen ; indexIn++){
				if(myArray[index] > myArray[indexIn]){
					temp = myArray[index];
					myArray[index] = myArray[indexIn];
					myArray[indexIn] = temp;
				}
			}System.out.print(myArray[index]);
		}
		


	}

}

