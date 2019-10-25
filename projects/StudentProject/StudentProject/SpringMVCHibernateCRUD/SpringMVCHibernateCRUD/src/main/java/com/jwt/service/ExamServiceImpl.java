package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ExamDAO;
import com.jwt.model.Exam;

@Service
@Transactional
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO examDAO;

	@Override
	@Transactional
	public void addExam(Exam exam) {
		examDAO.addExam(exam);
		examDAO.updateStudentFinalScore(exam.getId());
	}

	

	@Override
	@Transactional
	public void deleteExam(int examId,int id) {
		examDAO.deleteExam(examId);
		examDAO.updateStudentFinalScore(id);
	}

	
	public Exam updateExam(Exam exam) {
		exam=examDAO.updateExam(exam);
		examDAO.updateStudentFinalScore(exam.getId());
		return exam;
	}

	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}
	
	public List<Exam> getExamsById(int sid) {
		return examDAO.getExamsById(sid);
	}
	
	public Exam getExamByExamId(int eid) {
		return examDAO.getExamByExamId(eid);
	}

}
