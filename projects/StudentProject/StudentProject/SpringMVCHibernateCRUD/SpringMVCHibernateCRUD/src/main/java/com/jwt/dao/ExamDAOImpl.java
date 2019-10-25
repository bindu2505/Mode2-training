package com.jwt.dao;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Exam;
import com.jwt.model.Student;

@Repository
public class ExamDAOImpl implements ExamDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addExam(Exam exam) {
		sessionFactory.getCurrentSession().saveOrUpdate(exam);

	}

	/*@SuppressWarnings("unchecked")
	public List<Exam> getAllExam() {

		return sessionFactory.getCurrentSession().createQuery("from Exam")
				.list();
	}*/

	@Override
	public void deleteExam(Integer examId) {
		Exam exam = (Exam) sessionFactory.getCurrentSession().load(
				Exam.class, examId);
		if (null != exam) {
			this.sessionFactory.getCurrentSession().delete(exam);
		}

	}

	
	@Override
	public Exam updateExam(Exam exam) {
		sessionFactory.getCurrentSession().update(exam);
		return exam;
	}
	
	public Exam getExamByExamId(int eid) {
		return (Exam) sessionFactory.getCurrentSession().get(
				Exam.class, eid);
	}
	
	public List<Exam> getExamsById(int id) {
		return sessionFactory.getCurrentSession().createQuery("from Exam where id="+id).list();
	}

	
	
	
	public Student getStudentById(int id) {
		//Logger.debug(new Date() +"  : "+ this.getClass() + " Method name : getStudentById("+id+") ");
		return (Student) sessionFactory.getCurrentSession().get(
				Student.class, id);
	}
	
	
	@Override
	public void updateStudentFinalScore(int id) {
		List list=sessionFactory.getCurrentSession().createQuery("from Student where id="+id).list();
		Student st=(Student)list.get(0);
		list=sessionFactory.getCurrentSession().createQuery("select avg(mark) from Exam where id="+id).list();
		Double dl = (double)list.get(0);
		if(list.get(0)!=null){
			st.setFinalScore((dl.floatValue()));
		} else {
			st.setFinalScore(0.0f);
		}
		sessionFactory.getCurrentSession().update(st);
		
	}



}