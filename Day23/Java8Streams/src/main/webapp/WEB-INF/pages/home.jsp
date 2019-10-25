<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<form:form action="search"  modelAttribute="searchEmployee">
		Employee name:
		<form:input path="empName" /><br/>AND<br/>
		Employee band:
		<form:select path = "band">
		 <form:option value = '0'>Select</form:option>
                     <form:option value = 'e'>Employ</form:option>
                     <form:option value = 'M'>Manager</form:option>
                     <form:option value = 'C'>Contractor</form:option>
                      </form:select> <br/>AND<br/>
         Salary Greater than:
         <form:input path="salary"/>
		<input type="submit" value="Search" />
		
		</form:form>
		
		
		<h2>No of Employee:${listEmployee.size() }</h2>
		
		<table border="1">

			<th>EmpName</th>
			<th>Salary</th>
			<th>Band</th>
			<th>DateOfJoin</th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.empName}</td>
					<td>${employee.salary}</td>
					<td>${employee.band}</td>
					<td>${employee.dateofJoin}</td>
					
					
				</tr>
			</c:forEach>
		</table>
		
		<!-- <h4>
			EmployeeList <a href="listEmployee">Click here</a>
		</h4> -->
		
	</div>
</body>
</html>