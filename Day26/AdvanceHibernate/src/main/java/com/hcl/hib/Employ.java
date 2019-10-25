package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


@Entity
@Table(name="Employ")
@NamedQueries({@NamedQuery(name="@HQL_GET_ALL_EMPLOY",query="from Employ")})
@NamedNativeQueries({@NamedNativeQuery(name="@SQL_GET_ALL_EMPLOY",query="select empno,name,dept from Employ")})
public class Employ {
	private int empno;
	private String  name;
	private String  dept;
	private String  desig;
	private int basic;
	
	
	@Id
	@Column(name="empno")
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="dept")
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Column(name="desig")
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	@Column(name="basic")
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", basic=" + basic
				+ "]";
	}
	
	


}
