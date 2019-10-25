package com.hcl.model;

import java.sql.Date;

public class Employee {
	private long empNo;
	private String empName;
	private String band;
	private String dateOfJoin;
	private long salary;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", band=" + band + ", dateOfJoin=" + dateOfJoin
				+ ", salary=" + salary + "]";
	}
	public Employee(long empNo, String empName, String band, String dateOfJoin, long salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.band = band;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
	}
	
	

	
	
	
	
	
	
	
	}	


