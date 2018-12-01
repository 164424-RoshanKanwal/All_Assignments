package com.roshan.bank;

public class SavingAccountVersion2 extends SavingsAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		
		return "Jivan Bima";
	}

	@Override
	public double getInsuranceAmount() {
		
		return 5_00_000;
	}

}
