package com.roshan.springREST.AssignmentsOnREST.Question5.service;

import java.util.List;

import com.roshan.springREST.AssignmentsOnREST.Question5.model.Employee;
import com.roshan.springREST.AssignmentsOnREST.Question5.model.EmployeeDAO;

public class EmployeeServiceImpl implements IEmployeeService {
	
	 
	static List<Employee> empList = EmployeeDAO.getAllEmployees();
	 
	 
	
	@Override
	public void addEmployee(Employee employee) {
		employee.setEmployeeId(empList.size()+1);
		empList.add(employee);
	}

	@Override
	public Employee searchEmployee(int empId) {
		
		return empList.get(empId+1);
	}

	@Override
	public void deleteEmployee(int empId) {
		empList.remove(empList.get(empId-1));

	}

	@Override
	public List<Employee> getAllEmployees() {
		return empList;
	}

	@Override
	public void updateEmployee(Employee emp, int empId) {
	
		for(Employee e : empList){
			if(e.getEmployeeId() == empId){
				e.setEmployeeDepartment(emp.getEmployeeDepartment());
				e.setEmployeeDesignation(emp.getEmployeeDesignation());
				e.setEmployeeName(emp.getEmployeeName());
				e.setEmployeeSalary(emp.getEmployeeSalary());
			}
		}
		
	}

}
