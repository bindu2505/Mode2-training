package com.jwt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Exam;
import com.jwt.service.ExamService;

@Controller
public class ExamController {

	private static final Logger logger = Logger
			.getLogger(ExamController.class);

	public ExamController() {
		logger.info("exam");
		System.out.println("ExamController()");
	}

	@Autowired
	private ExamService ExamService;

	@RequestMapping(value = "/examShow")
	public ModelAndView listExam(HttpServletRequest request,ModelAndView model) throws IOException {
		logger.info("Entering into listexam metthod....");
		int id = Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		List<Exam> listExam = ExamService.getExamsById(id);
		model.addObject("listExam", listExam);
		model.setViewName("examShow");
		return model;
	}

	@RequestMapping(value = "/newExam", method = RequestMethod.GET)
	public ModelAndView newContact(HttpServletRequest request,ModelAndView model) {
		logger.info("Entering into newcontact of exam method....");
		int id = Integer.parseInt(request.getParameter("id"));
		Exam exam = new Exam();
		exam.setId(id);
		model.addObject("exam", exam);
		model.setViewName("ExamForm");
		return model;
	}

	@RequestMapping(value = "/saveExam", method = RequestMethod.POST)
	public ModelAndView saveExam(@ModelAttribute Exam exam) {
		logger.info("Entering into saveExam metthod....");
		if (exam.getExamId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			ExamService.addExam(exam);
		} else {
			ExamService.updateExam(exam);
		}
		return new ModelAndView("redirect:/examShow?id="+exam.getId());
	}

	@RequestMapping(value = "/deleteExam", method = RequestMethod.GET)
	public ModelAndView deleteExam(HttpServletRequest request) {
		logger.info("Entering into deleteExam metthod....");
		int examId = Integer.parseInt(request.getParameter("examId"));
		int id=Integer.parseInt(request.getParameter("id"));
		ExamService.deleteExam(examId,id);
		return new ModelAndView("redirect:/examShow?id="+id);
	}

	@RequestMapping(value = "/editExam", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		logger.info("Entering into editcontact of exam metthod....");
		int examId = Integer.parseInt(request.getParameter("examId"));
		Exam exam = ExamService.getExamByExamId(examId);
		ModelAndView model = new ModelAndView("ExamForm");
		model.addObject("exam", exam);

		return model;
	}
	/*@ModelAttribute("subjectList")
	  public Map<String, String> getCountryList() {
	     Map<String, String> subjectList = new HashMap<String, String>();
	     subjectList.put("SQL", "SQL");
	     subjectList.put("JAVA", "JAVA");
	     subjectList.put("HTML", "HTML");
	     subjectList.put("CSS", "CSS");
	     return subjectList;
	  }*/
	
	


	

}