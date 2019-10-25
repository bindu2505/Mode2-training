package com.jwt.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Student")
public class Student implements Serializable{

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column(name="rollnum")   
	private int rollNum;

	@Column(name="sname")
	private String name;

	@Column(name="age")
	private int age;

	@Column(name="gender")
	private String gender;
	
	@Column(name="country")
	private String country;
	
	@Column(name="dateofjoin")
	private Date dateOfJoin;
	
	@Column(name="finalScore")
	private float finalScore;
	
	
	@Transient
	private String grade;

	public String getGrade() {
		GradeInterface gradeInterface=(float x)-> {String grade=x<=40?"Fail" : x<=60?"Second Class":x<=75?"First Class":"Distinction";return grade;};
		return gradeInterface.gradeStr(finalScore);
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public float getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}

	/*@Override
	public String gradeStr(int x) {
		return this.grade="Fail";
	}
	*/
	
	
	
}
