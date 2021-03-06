package StreamPracticeSQL;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStream {
	
		static ArrayList<Employee> employeeList = new ArrayList<>();
		static ArrayList<Department> departList = new ArrayList<Department>();
		
		public List<Employee> empList(){
		employeeList.add(new Employee(7369, "SMITH", "CLERK",7902 , 800, 0,20));
		employeeList.add(new Employee(7499,"ALLEN","SALESMAN",7698,1600,300,30));
		employeeList.add(new Employee(7521,"WARD","SALESMAN",7698,1250,500,30));
		employeeList.add(new Employee(7566,"JONES","MANAGER",7839,2975,0,20));
		employeeList.add(new Employee(7654,"MARTIN","SALESMAN",7698,1250,1400,30));
		employeeList.add(new Employee(7698,"BLAKE","MANAGER",7839,2850,0,30));
		employeeList.add(new Employee(7782,"CLARK","MANAGER",7839,2450,0,10));
		employeeList.add(new Employee(7788,"SCOTT","ANALYST",7566,3000,0,20));
		employeeList.add(new Employee(7839,"KING","PRESIDENT",7566,5000,0,10));
		employeeList.add(new Employee(7844,"TURNER","SALESMAN",7698,1500,0,30));
		employeeList.add(new Employee(7876,"ADAMS","CLERK",7788,1100,0,20));
		employeeList.add(new Employee(7900,"JAMES","CLERK",7698,950,0,30));
		employeeList.add(new Employee(7902,"FORD","ANALYST",7566,3000,0,20));
		employeeList.add(new Employee(7934,"MILLER","CLERK",7782,1300,0,10));
		
		return employeeList;
		}
		
		public List<Department> deptList(){
		departList.add(new Department(10,"ACCOUNTING" , "New York"));
		departList.add(new Department(20,"RESEARCH" , "DALLAS"));
		departList.add(new Department(30,"SALES" , "CHICAGO"));
		departList.add(new Department(40,"OPERATIONS" , "BOSTON"));
		return departList;
	}
	
}
