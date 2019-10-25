package com.bindu;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employ, Integer>{
	@Query("SELECT e from Employ e where dept=?1 and desig=?2")
	List<Employ> findByDeptAndDesig(String department,String designation);
	
	@Query("SELECT e from Employ e where dept=?1 and desig=?2")
	List<Employ> findByDept(String department,String designation);
	
	@Query("SELECT e from Employ e where dept=?1 and desig=?2")
	List<Employ> findByDesig(String department,String designation);
	
	@Query("SELECT e from Employ e where dept=?1 and desig=?2 and basic>?3")
	List<Employ> findBySalary(String department,String designation,int sal);
	
	@Query("SELECT e from Employ e where dept=?1 and desig=?2 and basic>?3 and name LIKE 'N%'")
	List<Employ> find(String department,String designation,int sal);
	
	@Query("SELECT e from Employ e where desig=?1 order by ?2 desc")
	List<Employ> findSort(String designation,String s);
	
	@Query("SELECT e from Employ e where desig=?1 and name LIKE 'N%' order by ?2 ")
	List<Employ> findSortLetter(String designation,String s);
	

}
