package com.bindu.java8streams.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = -3465813074586302847L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int empNo;
	
	@Column(name="empName") 
	private String empName;
	
	@Column(name="salary") 
	private float salary;
	
	@Column(name="band") 
	private char band;
	
	@Column(name="dateofJoin") 
	private Date dateofJoin;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empNo, String empName, float salary, char band, Date dateofJoin) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.band = band;
		this.dateofJoin = dateofJoin;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public char getBand() {
		return band;
	}
	public void setBand(char band) {
		this.band = band;
	}
	public Date getDateofJoin() {
		return dateofJoin;
	}
	public void setDateofJoin(Date dateofJoin) {
		this.dateofJoin = dateofJoin;
	}
	
	
	
}
