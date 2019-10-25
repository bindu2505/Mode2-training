package com.jwt.dao;

import java.util.List;

import com.jwt.model.Exam;
import com.jwt.model.Student;

public interface ExamDAO {
	public void addExam(Exam exam);

	public void deleteExam(Integer examId);

	public Exam updateExam(Exam exam);

	public Exam getExamByExamId(int eid);
	
	public List<Exam> getExamsById(int sid);
	
	public Student getStudentById(int id);

	public void updateStudentFinalScore(int sid);
}
