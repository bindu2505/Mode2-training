package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exam")
public class Exam {
	
	
	@Column(name="id")
	private int id;
	
	@Column(name="subName")

	private String subName;
	
	@Column(name="mark")

	private int mark;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="examId")
	private int examId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int marks) {
		this.mark = marks;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int studentId) {
		this.examId = studentId;
	}
	
	

}
