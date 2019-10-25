<%@page import="com.hcl.hib.EmployCrud"%>
<%@page import="com.hcl.hib.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="EmployInsert.jsp">
		<center>
			Employ No:
				<input type="text" name="empno" /> <br/><br/> 
			Employ Name:
				<input type="text" name="name" /> <br/><br/> 
			 Department:
				<input type="text" name="dept" /> <br/><br/> 
			 Designation:
				<input type="text" name="desig" /> <br/><br/> 
			Salary :
				<input type="text" name="basic" /> <br/><br/> 
				<input type="submit" value="Insert" />
			</center>
	
	</form>
	<%
		if(request.getParameter("empno")!= null && 
		request.getParameter("basic")!= null && 
		request.getParameter("name")!= null && 
		request.getParameter("dept")!= null && 
		request.getParameter("desig")!= null){
			Employ e=new Employ();
			e.setEmpno(Integer.parseInt(request.getParameter("empno")));
			e.setName(request.getParameter("name"));
			e.setDept(request.getParameter("dept"));
			e.setDesig(request.getParameter("desig"));
			e.setBasic(Integer.parseInt(request.getParameter("basic")));
			EmployCrud crud=new EmployCrud();
			out.println(crud.insertEmploy(e));
		}
	%>

</body>
</html>