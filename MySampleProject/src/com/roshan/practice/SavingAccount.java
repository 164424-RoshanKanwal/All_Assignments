package com.roshan.practice;

public class SavingAccount extends BankAccount{
	

	
public void deposit(){
	
	System.out.println("deposit");
}
public static void main(String[] args) {
SavingAccount acc = new SavingAccount();
acc.withdraw();
	
	
}
}
