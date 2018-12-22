package com.roshan.springREST.AssignmentsOnREST.Question5.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employee {

	/*Create a Employee domain model class having following properties: 
		employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary. 
	Employee Id should be generated automatically at database level.*/
	
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private String employeeDesignation;
	private int employeeSalary;
	
	public Employee(){
		
	}

	
	public Employee(int employeeId, String employeeName,
			String employeeDepartment, String employeeDesignation,
			int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
