package com.roshan.practice;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		
		int array[] = {12,22,3,2,2,5,5,45};
		
		Arrays.sort(array);
		for (int index = 0; index<8; index++){
			System.out.println(array[index]);
		}
		
		
	}
}
