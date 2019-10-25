package com.hcl.rest.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.rest.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<Employee> getAllEmployees() {
		
		


	return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}
	}


	

