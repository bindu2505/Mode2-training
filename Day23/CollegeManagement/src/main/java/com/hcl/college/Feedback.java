package com.hcl.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback {
	private String  fid;
	private String  studentname;
	private String  instructor;
	private String  subject;
	private String fbvalue;
	
	@Id
	@Column(name="fid")
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	
	@Column(name="studentName")
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	@Column(name="instructor")
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	@Column(name="subject")
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Column(name="fbvalue")
	public String getFbvalue() {
		return fbvalue;
	}
	public void setFbvalue(String fbvalue) {
		this.fbvalue = fbvalue;
	}
	
	
	
		
}
