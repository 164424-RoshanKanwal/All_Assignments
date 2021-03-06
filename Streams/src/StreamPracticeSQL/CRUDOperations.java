package StreamPracticeSQL;

import java.util.List;
import java.util.stream.Collectors;

public class CRUDOperations extends EmployeeStream{
	
	public static void main(String[] args) {
		
		EmployeeStream emp = new EmployeeStream();
		List<Employee> employeeList = emp.empList();
		List<Department> departmentList = emp.deptList();
		
		
	/*List<Integer> deptId = departmentList.stream().map(s -> s.getDeptId())
	 * 							.collect(Collectors.toList());										//----1
	System.out.println(deptId);
	System.out.println("-----------------------------------");*/
	
	//employeeList.stream().map(s-> s.getName()).forEach(System.out::println);     					//------2
		
		
	/*employeeList.stream().filter(s-> s.getDeptId()==30)											//------3	
							.map(s-> s.getName())
							.forEach(System.out::println);*/
	
		//List the names, numbers and departmentno of all clerks.
/*	employeeList.stream().filter(s-> s.getJob().equals("CLERK"))
						.map(s-> s.getName()+ " " + s.getEmpId()+ " "  + s.getDeptId())				//-------4
						.forEach(System.out::println);*/ 
		
		//Find the depart numbers and the name of employee of all dept with Deptno greater or equal to 20.
		/*employeeList.stream().filter(s-> s.getDeptId() >= 20)
											.map(s-> s.getDeptId() + " " + s.getName())				//--------5
											.forEach(System.out::println);
		*/
		//Find the employees whose commission is greater than their salary
		/*employeeList.stream().filter(employee -> employee.getComm() > employee.getSalary())		//-------6
							.map(employee-> employee)
							.forEach(System.out::println);*/
		
		
		//Find the employees whose commission is greater than 60 percent of their salary.
	/*	employeeList.stream().filter(employee -> employee.getComm() > 0.6*employee.getSalary())		//-------7
								.forEach(System.out::println);*/
		
		
		//8. Find the employee whose commission is greater than 50 percent of their salary.
		/*employeeList.stream().filter(employee -> employee.getComm() > 0.6*employee.getSalary())		//-------8
		.forEach(System.out::println);*/
		
		//9. List the name, job and salary of all employees in dept 20 who earn more than 2000.
		/*employeeList.stream().filter(employee -> employee.getDeptId()==20 && employee.getSalary()> 2000 //-------9
							.forEach(System.out::println);*/
		//10. Find all salesmen in dept 30 whose salary is greater than or equal to Rs. 1500.
		/*employeeList.stream()
				.filter(employee -> employee.getSalary() >=1500 && employee.getJob().equals("SALESMAN")) //-------10
				.forEach(System.out::println);*/
		
		//11. Find all the employees whose job is either a president or manager.
		/*employeeList.stream()
					.filter(employee -> employee.getJob().equals("MANAGER" )|| employee.getJob().equals("PRESIDENT"))
					.forEach(System.out::println);*/
	
		//12. Find all managers who are not in dept 30.
		/*employeeList.stream().filter(s-> s.getJob().equalsIgnoreCase("manager") && s.getDeptId()!=30)
		.forEach(System.out::println);*/
		
		//13. Find the details of all managers and clerks in dept 10.
		/*employeeList.stream()
		.filter(s-> s.getDeptId()==10 && (s.getJob().equalsIgnoreCase("manager") || s.getJob().equalsIgnoreCase("clerk")))
		.forEach(System.out::println);*/
		
		//14. Find the details of all manager (in any dept) and all clerks in dept 10
		/*employeeList.stream().filter(s-> s.getJob().equalsIgnoreCase("manager") || (s.getJob().equalsIgnoreCase("clerk")&& s.getDeptId() == 10))
		.forEach(System.out::println);*/
		
		//16. Find all employees who are neither clerks nor manager but whose salary is greater than or equal to Rs. 2000.
		//employeeList.stream().filter(s-> s.getSalary()>=2000).filter(s-> s.getJob()))//----wrong
		
		//17. Find the employees who earns between Rs. 1200 and Rs.1400.
		//18. Find the employees who are clerks, analysts or salesman.
		//19. Find the employees who are not clerks, analyst or salesman.
		
	}

}
