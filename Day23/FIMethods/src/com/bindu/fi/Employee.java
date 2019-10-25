package com.bindu.fi;

public class Employee {
	private int empNo;
	private String empName;
	
	public Employee(int empNo) {
		super();
		this.empNo = empNo;
	}
	
	public Employee( String empName) {
		super();
		this.empName = empName;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
