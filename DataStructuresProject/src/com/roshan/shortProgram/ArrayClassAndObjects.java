package com.roshan.shortProgram;

public class ArrayClassAndObjects {
public static void main(String[] args) {
	ArraySorting arraysort = new ArraySorting();
	arraysort.setArray();
	arraysort.ascOrder(arraysort.myArray, arraysort.myArrayLen);
	arraysort.descOrder(arraysort.myArray, arraysort.myArrayLen);
}
}
