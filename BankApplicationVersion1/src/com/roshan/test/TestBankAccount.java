package com.roshan.test;

import com.roshan.bank.SavingsAccount;

public class TestBankAccount {

	public static void testSavingAccount(){
		SavingsAccount savingAcc = new SavingsAccount("Roshan", 6000);
		System.out.println("Account No. is " + savingAcc.getAccountNo());
		System.out.println("Account Balance is " + savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		System.out.println("---------------------------------------------");
		savingAcc.withdraw(3000);
		System.out.println("Account Balance " + savingAcc.getAccountBalance());
	}
	
	public static void main(String[] args) {
		testSavingAccount();
	}
		
	}

