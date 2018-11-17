package com.roshan.assignment1;

public class Salary {

public static void main(String[] args) {
	IncomeTax incomeTax = new IncomeTax("Roshan",650000);
	IncomeTax incomeTax2 = new IncomeTax("Sneha", 1000000);
	incomeTax.tax();
	incomeTax2.tax();
}
}
