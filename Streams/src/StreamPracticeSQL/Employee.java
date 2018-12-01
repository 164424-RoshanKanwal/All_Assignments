package StreamPracticeSQL;

public class Employee {

	private int empId;
	private String name;
	private String job;
	private int manId;
	private int salary;
	private int comm;
	private int deptId;

	
	
	public Employee(int empId, String name, String job, int manId, int salary,
			int comm, int deptId) {
		super();
		this.empId = empId;
		this.name = name;
		this.job = job;
		this.manId = manId;
		this.salary = salary;
		this.comm = comm;
		this.deptId = deptId;
	}



	public int getDeptId() {
		return deptId;
	}



	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public int getManId() {
		return manId;
	}



	public void setManId(int manId) {
		this.manId = manId;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getComm() {
		return comm;
	}



	public void setComm(int comm) {
		this.comm = comm;
	}

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", job=" + job
				+ ", manId=" + manId + ", salary=" + salary + ", comm=" + comm
				+ ", deptId=" + deptId +  "]";
	}



	
}
