package com.bindu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bindu.model.Employee;
import com.bindu.service.EmployeeService;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> list=employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(list,new HttpHeaders(),HttpStatus.OK);
		
	}
	
	@RequestMapping("/{id}/get")
	public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable int id){
		return new ResponseEntity<Optional<Employee>>(employeeService.getEmployee(id),new HttpHeaders(),HttpStatus.OK);
		
	}
	  @DeleteMapping("/{id}/delete") 
	  public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		  return new ResponseEntity<String>(employeeService.deleteEmployee(id),new HttpHeaders(),HttpStatus.OK);
	  
	  }
	 
	
	@RequestMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody String empStr) {
		return new ResponseEntity<String>(employeeService.addEmployee(empStr),new HttpHeaders(),HttpStatus.OK);
	}
	
	@RequestMapping("/addAll")
	public ResponseEntity<String> addEmployees(@RequestBody String empStr) {
		return new ResponseEntity<String>(employeeService.addEmployees(empStr),new HttpHeaders(),HttpStatus.OK);
	}
	
	@PostMapping("/deleteAll")
	public ResponseEntity<String> deleteEmployees(@RequestBody String empStr) {
		return new ResponseEntity<String>(employeeService.deleteEmployees(empStr),new HttpHeaders(),HttpStatus.OK);
	}
	
	@RequestMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody String empStr) {
		return new ResponseEntity<String>(employeeService.updateEmployee(empStr),new HttpHeaders(),HttpStatus.OK);
	}
	
	@RequestMapping("/updateAll")
	public ResponseEntity<String> updateEmployees(@RequestBody String empStr) {
		return new ResponseEntity<String>(employeeService.updateEmployees(empStr),new HttpHeaders(),HttpStatus.OK);
	}
	
	
	

}
