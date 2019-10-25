package com.bindu.fi;

public class EmployeeMain {
	public static void main(String[] args) {
		EmpInterface1  employeeInterface=Employee::new;
		Employee employee=employeeInterface.num(29);
		
		EmpInterface2  employeeInterface1=Employee::new;
		Employee employee2=employeeInterface1.name("Bindu");
		
		System.out.println(employee.getEmpNo());
		System.out.println(employee2.getEmpName());
	}
}
