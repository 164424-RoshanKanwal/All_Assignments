package com.roshan.bank; //collection of logical classes

public abstract class BankAccount {
	//static variable
	private static int autoAccountNo;//static is used to provide common data to all its objects

	//instance variable	/ class variable (we cannot use instance variable without objects)
	private int accountNo; 
	private String accountHolderName;
	protected double accountBalance;

	{		//init block  (IIB)

		accountNo=++autoAccountNo;

	}

	public BankAccount(){     //initializing class variable or instance variable
		//default constructor
		accountHolderName = "Unknown";
		accountBalance = 0;
	}

	public BankAccount(String accountHolderName, double accountBalance){//parameterized constructor
		//constructor overloading
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;

	}
	//getter methods
	public double getAccountBalance() {
		return accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	} 


	//setter method
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;//reinitializing or modifying existing class variables
	}
	//service methods
	
		
	public void deposit(double amount){
		if(amount<= 0){
			System.out.println("Enter valid amount");
		}else{
		this.accountBalance += amount; 
		System.out.println("Successful transaction");
		System.out.println("Current Balance " + accountBalance);
	}
		

	}


	

	
}
