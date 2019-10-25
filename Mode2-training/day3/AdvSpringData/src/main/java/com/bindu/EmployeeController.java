package com.bindu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository dao;
	
	int numOfRecords=5;
	int numOfPages;  //no of pages
	
	@RequestMapping("/")
	public ModelAndView getEmployees(){
		ModelAndView mv=new ModelAndView();
		List<Employ> emp=(List<Employ>) dao.findAll();
		numOfPages=emp.size()/numOfRecords + emp.size() % numOfRecords;
		mv.addObject("employList", emp);
		mv.addObject("pages",numOfPages);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayjavacontractors")
	public ModelAndView getjavacontractors() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findByDeptAndDesig("IT", "Engineer"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaydotnetcontractors")
	public ModelAndView getdotnetcontractors() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findByDept("dotnet","programmer"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaymanagercontractors")
	public ModelAndView getmanagercontractors() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findByDesig( "medical","student"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaysalcontractors")
	public ModelAndView getsalcontractors() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findBySalary("IT", "Engineer",100000));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaycontractors")
	public ModelAndView getcontractors() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.find("Business", "BCom",45780));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAllSortByDesig")
	public ModelAndView getcontractorsBySort() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findAll(Sort.by("desig")));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAllSortByDesigDescending")
	public ModelAndView getcontractorsBySortdes() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findAll(Sort.by("desig").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAllSortByDeptAndSalDescending")
	public ModelAndView getcontractorsBySorting() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findAll(Sort.by("dept").descending().and(Sort.by("basic").descending())));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaySortByStudentAndSal")
	public ModelAndView getcontractorsBySorts() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findSort("student","basic"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaySortByStudentAndSalwithN")
	public ModelAndView getcontractorsBySortsWithN() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employList", dao.findSortLetter("student","basic"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAll/Page/{pageno}")
	public ModelAndView displayPage(@PathVariable("pageno") int pageno) {
		ModelAndView mv=new ModelAndView();
		Page<Employ> pages=dao.findAll(PageRequest.of(pageno, numOfRecords));
		mv.addObject("pages",numOfPages);
		mv.addObject("employList", (pages).getContent());
		mv.setViewName("home");
		return mv;
	}
}
