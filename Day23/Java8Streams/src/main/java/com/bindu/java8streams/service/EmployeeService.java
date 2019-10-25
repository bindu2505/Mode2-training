package com.bindu.java8streams.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bindu.java8streams.model.Employee;

@Service
public interface EmployeeService {
	public List<Employee> getAllEmployee();
}
