package com.journaldev.jaxrs.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.journaldev.jaxrs.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

@Autowired
private SessionFactory sessionFactory;

@Override
public void addEmployee(Employee e) {
sessionFactory.getCurrentSession().saveOrUpdate(e);
}

@Override
public void deleteEmployee(int id) {
Employee Employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
if (null != Employee) {
this.sessionFactory.getCurrentSession().delete(Employee);
}
}

@Override
public Employee getEmployee(int id) {
return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
}

@Override
public List<Employee> getAllEmployees() {


return sessionFactory.getCurrentSession().createQuery("from Employee")
.list();
}
}

