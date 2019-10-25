package com.jwt.service;

import java.util.List;

import com.jwt.model.Exam;

public interface ExamService {
	
	public void addExam(Exam exam);

	public void deleteExam(int examId,int sid);

	public Exam updateExam(Exam exam);
	
	public Exam getExamByExamId(int eid);
	
	public List<Exam> getExamsById(int sid);
}
