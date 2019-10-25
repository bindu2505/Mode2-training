package com.bindu.service;

import java.util.List;
import java.util.Optional;

import com.bindu.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public String addEmployee(String employee);
	
	public String addEmployees(String employee);
	
	public String deleteEmployee(Integer empId);
	
	public String deleteEmployees(String empStr);
	

	public String updateEmployee(String empStr);

	public String updateEmployees(String empStr);

	public Optional<Employee> getEmployee(Integer empId);

}
