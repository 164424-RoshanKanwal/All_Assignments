package com.roshan.collectionAssignmentQuestion9;

public class SavingAccount {
//acc_balance, acc_ID, accountHoldername, isSalaryAccount.
	
	private int accID;
	private String accHolderName;
	private int accBalance;
	private boolean isSalaryAccount;
	
	
	public SavingAccount(int accID, String accHolderName, int accBalance,
			boolean isSalaryAccount) {
		super();
		this.accID = accID;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAccBalance() {
		return accBalance;
	}
	
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	
	public int getAccID() {
		return accID;
	}
	
	public void setAccID(int accID) {
		this.accID = accID;
	}
	
	public String getAccHolderName() {
		return accHolderName;
	}
	
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public void withdraw(int amount){
		if(amount<accBalance){
		accBalance -= amount;
		}
		else{
			System.out.println("Insufficient Balance");
		}
		
	}
	
	@Override
	public String toString() {
		return "SavingAccount [accID=" + accID + ", accHolderName="
				+ accHolderName + ", accBalance=" + accBalance
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	public int deposit(int amount){
		
		accBalance += amount;
		
		return accBalance;
	}
	
}
