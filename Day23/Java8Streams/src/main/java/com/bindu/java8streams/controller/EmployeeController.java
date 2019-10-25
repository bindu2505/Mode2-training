package com.bindu.java8streams.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bindu.java8streams.model.Employee;
import com.bindu.java8streams.service.EmployeeService;


@Controller
public class EmployeeController {
	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public EmployeeController() {
		logger.info("EmployeeController");
		System.out.println("EmployeeController()");
	}
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployee();
		model.addObject("searchEmployee", new Employee());
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}
	
	
	@RequestMapping(value = "/search", method=RequestMethod.POST)
	public ModelAndView searchEmployees(ModelAndView model,@ModelAttribute Employee searchEmployee) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployee();
		if(searchEmployee.getBand()!='0'){
			listEmployee=listEmployee.stream()
					.filter((var)->var.getEmpName()
					.startsWith(searchEmployee.getEmpName())
					&& var.getBand()==searchEmployee.getBand()
					&& var.getSalary()>searchEmployee.getSalary())
					.collect(Collectors.toList());
			} else {
			listEmployee=listEmployee.stream()
					.filter((var)->var.getEmpName()
					.startsWith(searchEmployee.getEmpName())
					&&  var.getSalary()>searchEmployee.getSalary())
					.collect(Collectors.toList());
		}
		//listEmployee=listEmployee.stream().filter((var)->var.getEmpName().startsWith(searchEmployee.getEmpName()) & 
			//	var.getBand()==(searchEmployee.getBand()) & var.getSalary()>(searchEmployee.getSalary())).collect(Collectors.toList());
		model.addObject("searchEmployee",searchEmployee );
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}
	
	/*@RequestMapping(value = "/search" , method=RequestMethod.POST)
	public ModelAndView searchEmployee(ModelAndView model) throws IOException {
		List<Employee> searchEmployee = employeeService.getAllEmployee();
		model.addObject("searchEmployee", searchEmployee);
		model.setViewName("home");
		return model;
	} */

}
