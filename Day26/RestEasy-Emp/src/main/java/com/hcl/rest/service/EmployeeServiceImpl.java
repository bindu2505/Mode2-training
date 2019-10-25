package com.hcl.rest.service;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hcl.rest.dao.EmployeeDAOImpl;
import com.hcl.rest.model.Employee;



@Path("/employee")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAOImpl dao=new EmployeeDAOImpl(); 
		
	
	

	@Override
	@GET
	@Path("/getAll")
	public Employee[] getAllEmployees() {
		List<Employee> ids = dao.getAllEmployees();
		Employee[] e = new Employee[ids.size()];
		int i=0;
		for(Employee id : ids){
			e[i] = (Employee)dao.getAllEmployees();
			i++;
		}
		return e;
	}

}
