package com.lambda1;



public class LambdaQ1 {

	public static void main(String[] args) {
	
		Operation add = (a,b) -> a+b;
		Operation sub= (a,b) -> a-b;
		Operation mul  = (a,b) -> a*b;
		Operation div = (a,b) -> a/b;
		
		
		System.out.println(add.operate(4,5));
		System.out.println(sub.operate(45, 43));
		System.out.println(mul.operate(4, 5));
		System.out.println(div.operate(45, 9));
		
	}
}

interface Operation {
	int operate(int a, int b);
}