package com.bindu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bindu.model.Employee;
import com.bindu.repositry.EmployeeRepositry;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepositry empRepositry;
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeesList= (List<Employee>) empRepositry.findAll();
		if(employeesList.size()>0) {
			return employeesList;
		} else {
			return new ArrayList<Employee>();
		}
	}
	
	@Override
	public Optional<Employee> getEmployee(Integer empId) {
		return empRepositry.findById(empId);
	}


	@Override
	public String addEmployee(String empStr) {
		
		JSONArray arr=(JSONArray)JSONValue.parse(empStr);

	    Employee employee=new Employee();
	    
	 for(int i=0;i<arr.size();i++){
		 JSONObject a=(JSONObject) arr.get(i);
		 long empno = (long) a.get("id");
		 employee.setId((int)empno);
		 String empName = (String) a.get("name");
		 employee.setName(empName);
		 double salary = (double) a.get("salary");
		 employee.setSalary(salary);
	 }
		  Employee emp=empRepositry.save(employee);
	 
		  if(emp!=null) {
			  return  "Employee added successfully";
		  } else {
				  return "Not Added"; 
		  }
	}

	@Override
	public String deleteEmployee(Integer empId) {
		empRepositry.deleteById(empId);
		return "deleted";
		
	}

	

	@Override
	public String addEmployees(String empStr) {
		JSONArray arr=(JSONArray)JSONValue.parse(empStr);
	    
	    List<Employee> lst=new ArrayList<Employee>();
	    
	   for(int i=0;i<arr.size();i++){
		   Employee employee=new Employee();
		 JSONObject a=(JSONObject) arr.get(i);
		 long empno = (long) a.get("id");
		 employee.setId((int)empno);
		 String empName = (String) a.get("name");
		 employee.setName(empName);
		 double salary = (double) a.get("salary");
		 employee.setSalary(salary);
		   lst.add(employee);
	    }
	   List<Employee> lst3=(List<Employee>) empRepositry.saveAll(lst);

	   if(lst3!=null) {
			  return  "Employee added successfully";
		  } else {
				  return "Not Added"; 
		  }

	}

	@Override
	public String deleteEmployees(String empStr) {
JSONArray arr=(JSONArray)JSONValue.parse(empStr);
	    
	    List<Employee> lst=new ArrayList<Employee>();
	    
	   for(int i=0;i<arr.size();i++){
		   Employee employee=new Employee();
		 JSONObject a=(JSONObject) arr.get(i);
		 long empno = (long) a.get("id");
		 employee.setId((int)empno);
		 String empName = (String) a.get("name");
		 employee.setName(empName);
		 double salary = (double) a.get("salary");
		 employee.setSalary(salary);
		   lst.add(employee);
	    }
	    empRepositry.deleteAll(lst);

			  return  "Employee deleted successfully";


	}
	
	
	
	@Override
	public String updateEmployee(String empStr) {
		
		JSONArray arr=(JSONArray)JSONValue.parse(empStr);

	    Employee employee=new Employee();
	    
	 for(int i=0;i<arr.size();i++){
		 JSONObject a=(JSONObject) arr.get(i);
		 long empno = (long) a.get("id");
		 employee.setId((int)empno);
		 String empName = (String) a.get("name");
		 employee.setName(empName);
		 double salary = (double) a.get("salary");
		 employee.setSalary(salary);
	 }
		  Employee emp=empRepositry.save(employee);
	 
		  
			  return  "Employee updated successfully";
		
	}
	
	
	@Override
	public String updateEmployees(String empStr) {
		JSONArray arr=(JSONArray)JSONValue.parse(empStr);
	    
	    List<Employee> lst=new ArrayList<Employee>();
	    
	   for(int i=0;i<arr.size();i++){
		   Employee employee=new Employee();
		 JSONObject a=(JSONObject) arr.get(i);
		 long empno = (long) a.get("id");
		 employee.setId((int)empno);
		 String empName = (String) a.get("name");
		 employee.setName(empName);
		 double salary = (double) a.get("salary");
		 employee.setSalary(salary);
		   lst.add(employee);
	    }
	   List<Employee> lst3=(List<Employee>) empRepositry.saveAll(lst);

	   
			  return  "Employees upadted successfully";
		

	}


}
