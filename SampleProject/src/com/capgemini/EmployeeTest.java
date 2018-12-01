package com.capgemini;

public class EmployeeTest {

	public static void main(String[] args) {
		DBOperations db = new EmployeeMgtApplication();// you cannot create object for interface.
		db.write();
		db.delete();
	}

}
