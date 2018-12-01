package com.roshan.collectionAssignmentQuestion9;


import java.util.TreeSet;

public class BankAccountList {

	static TreeSet<SavingAccount> set;
	public BankAccountList() {
		set = new TreeSet<SavingAccount>(new MyComparator());
	}
	
	public boolean addAcc(SavingAccount savingAcc){
		return set.add(savingAcc);
	}
	
	public static void main(String[] args) {
		
		BankAccountList accList = new BankAccountList();
		SavingAccount first = new SavingAccount(101, "Roshan", 1000, true);
		accList.addAcc(new SavingAccount(107, "Kanwal", 2343, false));
		accList.addAcc(new SavingAccount(102, "K", 2343, false));
		accList.addAcc(new SavingAccount(103, "Ky", 2343, false));
		accList.addAcc(new SavingAccount(100, "Ka", 2343, false));
		first.deposit(300);
		accList.addAcc(first);
		accList.addAcc(new SavingAccount(104, "Kanre", 2343, false));
		
		System.out.println(set);
		
		
	}
	
	
	
}
