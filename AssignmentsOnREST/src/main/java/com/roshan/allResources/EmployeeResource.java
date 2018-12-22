package com.roshan.allResources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.roshan.springREST.AssignmentsOnREST.Question5.model.Employee;
import com.roshan.springREST.AssignmentsOnREST.Question5.service.EmployeeServiceImpl;
import com.roshan.springREST.AssignmentsOnREST.Question5.service.IEmployeeService;

@Path("employees")
public class EmployeeResource {

	IEmployeeService iService = new EmployeeServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
public List<Employee> getAllEmployees() {
		return iService.getAllEmployees();
	}
	
	@GET
	@Path("{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee searchEmployee(@PathParam ("empId") int empId) {
		return iService.searchEmployee(empId);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addEmployee(Employee employee) {
		iService.addEmployee(employee);
		return "Done";
	}
	
	
	@DELETE
	@Path("{empId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteEmployee(@PathParam("empId")int empId) {
		
		iService.deleteEmployee(empId);
		return "Done";
	}

	@PUT
	@Path("{empId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateEmployee(Employee emp, @PathParam ("empId") int empId) {
		
		iService.updateEmployee(emp, empId);
		return "Done";
	}
}
