<%@page import="com.hcl.hib.Employ"%>
<%@page import="com.hcl.hib.EmployCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int empno=Integer.parseInt(request.getParameter("empno"));
		EmployCrud crud=new EmployCrud();
		Employ e=crud.searchEmploy(empno);
	%>
	<form method="get" action="EmployUpdate.jsp">
		Employ No:
		<input type="text" name="empno" readonly="readonly" value=<%=e.getEmpno() %> /><br/><br/>
		Employ Name:
		<input type="text" name="name" value=<%=e.getName() %> /><br/><br/>
	Department :
		<input type="text" name="dept"  value=<%=e.getDept() %> /><br/><br/>
	Designation:
		<input type="text" name="desig"  value=<%=e.getDesig()%> /><br/><br/>
	Salary:
		<input type="text" name="basic"  value=<%=e.getBasic() %> /><br/><br/>
		<input type="submit" value="Update" />
	
	</form>
	
	<%
		if(request.getParameter("empno")!= null && 
		request.getParameter("basic")!= null && 
		request.getParameter("name")!= null && 
		request.getParameter("dept")!= null && 
		request.getParameter("desig")!= null){
			 e=new Employ();
			e.setEmpno(Integer.parseInt(request.getParameter("empno")));
			e.setName(request.getParameter("name"));
			e.setDept(request.getParameter("dept"));
			e.setDesig(request.getParameter("desig"));
			e.setBasic(Integer.parseInt(request.getParameter("basic")));
			 crud=new EmployCrud();
			out.println(crud.updateEmploy(e));
		%>
		<jsp:forward page="EmployShow.jsp" />	
		<% 
		}
	%>
	
</body>
</html>