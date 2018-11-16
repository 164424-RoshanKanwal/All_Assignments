package com.roshan.practice;

public class BitSortArray {
public static void main(String[] args) {
	int[] myArray = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
	
	int myArrayLen = myArray.length;
	
	
		int temp;
		for(int index = 0; index < myArrayLen; index++){
			for (int indexIn = index+1; indexIn < myArrayLen ; indexIn++){
				if(myArray[index] > myArray[indexIn]){
					temp = myArray[index];
					myArray[index] = myArray[indexIn];
					myArray[indexIn] = temp;
				}
			}System.out.print(myArray[index] + " ");
		}
		System.out.println();}
	
	
}

