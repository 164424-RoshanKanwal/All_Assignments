package com.roshan.bank;

import java.util.Scanner;

import com.roshan.test.TestBankAccount;

public class CurrentAccount extends BankAccount{
	double overDraftLimit;

	{
		this.overDraftLimit = 20000;
	}

	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	}

	public CurrentAccount(){
		super();
	}

	/*@Override
	public void withdraw(double amount) {
		double temp;
		if(amount <= accountBalance){
			System.out.println("Successful Transaction");
			accountBalance = accountBalance - amount;
			//System.out.println(accountBalance);

		}else if ( amount <= overDraftLimit + accountBalance &&  amount > accountBalance){
			temp = accountBalance - amount;
			overDraftLimit = overDraftLimit + temp;
			accountBalance = 0;

			System.out.println("Any more transaction. You can withdraw "+ overDraftLimit +" more from your ODLimit");
			System.out.println("Enter Y -----> Yes or N ----> No.");
			Scanner scan = new Scanner(System.in);
			String option = scan.nextLine();

			if(option.equals("Y")){
				TestBankAccount.testCurrentAccount();	
			} 
			else if(option.equals("N")){
				System.out.println("Thank you for using our services");
			}

			else {
				System.out.println("Invalid Option");
			}
			scan.close();
			
		}
		else {
			System.out.println("Over draft limit!!!");
		}
	}*/


}
