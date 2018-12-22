package com.roshan.springREST.AssignmentsOnREST.Question5.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {


	
public static List<Employee> getAllEmployees(){
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Roshan", "Operations", "Analyst", 12000));
		employeeList.add(new Employee(2, "Rosha", "Operatio", "Analys", 1200));
		employeeList.add(new Employee(3, "Rosh", "Operati", "Analy", 120));
		return employeeList;
}
	
}
