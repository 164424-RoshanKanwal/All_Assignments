package com.roshan.bank;

public class SavingsAccount extends BankAccount{
	
	boolean isSavingsAccount;
	
	public SavingsAccount(String accountHolderName, double accountBalance){
		super(accountHolderName, accountBalance);
		this.isSavingsAccount = true;
	}
	
	public SavingsAccount() {
		this.isSavingsAccount = true;//why not init?----> because it will generate phantom code which creates confusion!!
	}
	
	public SavingsAccount(String accountHolderName, double accountBalance, boolean isSavingsAccount){
		super(accountHolderName, accountBalance);//redundant code is allowed but phantom code is not required!!!!!
		this.isSavingsAccount = isSavingsAccount;//manual constructor chaining
		
	}
	public void withdraw(double amount){
		if(amount <= 0){
			System.out.println("Enter Valid Amount");
			}
		else if (amount > accountBalance-1000){
			System.out.println("Invalid exceeding available balance or Rs 1000 must avail in bank account");
		}
		else{
		this.accountBalance -= amount; 
		System.out.println("Successful transaction");}
		System.out.println("Current Balance " + accountBalance);
	}}