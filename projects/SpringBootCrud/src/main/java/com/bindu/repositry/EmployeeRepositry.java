package com.bindu.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bindu.model.Employee;

@Repository
public interface EmployeeRepositry extends CrudRepository<Employee, Integer> {
}
