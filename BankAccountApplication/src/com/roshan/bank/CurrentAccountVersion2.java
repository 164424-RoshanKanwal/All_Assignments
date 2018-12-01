package com.roshan.bank;

public class CurrentAccountVersion2 extends CurrentAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Har Ghar Bima";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 13_00_000;
	}

	public int withdraw(int i) {
		// TODO Auto-generated method stub
		return i;
	}

}
