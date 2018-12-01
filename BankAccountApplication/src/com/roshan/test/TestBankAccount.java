package com.roshan.test;

import com.roshan.bank.BankAccount;
import com.roshan.bank.CurrentAccount;
import com.roshan.bank.CurrentAccountVersion2;
import com.roshan.bank.SavingAccountVersion2;
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
	
	public static BankAccount getBankAccount(String accountType) {
		BankAccount acc= null; 
		if(accountType.equals("Saving")){
			acc = new SavingsAccount("Roshan", 4000);
		}
		else if(accountType.equals("Current")){
			acc = new CurrentAccount("Kanwal", 7000);
			
		}
		else {
			acc = null;
		}
		return acc;
	}
	public static void main(String[] args) {
		/*BankAccount acc = getBankAccount("Saving");
		System.out.println("Account Name " + acc.getAccountNo());
		System.out.println("Account Balance " + acc.getAccountBalance());
		acc.withdraw(3000);
		System.out.println("Account Balance " + acc.getAccountBalance());*/
		SavingAccountVersion2 acc = new SavingAccountVersion2();
		acc.withdraw(5666);
		acc.deposit(7999);
		
		acc.getInsuranceName();
		CurrentAccountVersion2 acc1 = new CurrentAccountVersion2();
		acc1.withdraw(5666);
		acc1.deposit(7999);
		
		acc1.getInsuranceName();

		
	}
		
	}

