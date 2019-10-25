package com.javainterviewpoint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}
