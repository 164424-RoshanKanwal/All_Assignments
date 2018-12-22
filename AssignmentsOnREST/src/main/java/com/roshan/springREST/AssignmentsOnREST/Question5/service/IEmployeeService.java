package com.roshan.springREST.AssignmentsOnREST.Question5.service;

import java.util.List;

import com.roshan.springREST.AssignmentsOnREST.Question5.model.Employee;

public interface IEmployeeService {
/*
	Add a new employee
	2. Searching for specific employee
	3. Deleting an existing employee
	4. Finding all employees
	5. Editing/updating employee information.*/
	
	void addEmployee(Employee employee);
	Employee searchEmployee(int empId);
	void deleteEmployee(int empId);
	List<Employee> getAllEmployees();
	void updateEmployee(Employee emp, int empId);
	
}
