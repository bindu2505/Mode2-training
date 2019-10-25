<%@page import="com.hcl.college.CollegeCRUD"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Select.jsp" name="frmFeedback">
<center>


	Instructor:
		<select name="instructor" onchange="change()">
		 <option value="please Select">Please select </option>
         <%
		List<String> lst=new CollegeCRUD().instructorList();
		for(String s : lst){
	%>
	<option value=<%=s %>><%=s%></option>
	<%
		}
	%>
	
      </select>
      
      
     <br/><br/>
     <%
  	    session.setAttribute("instructor",request.getParameter("instructor"));
     %>
		
	Subjects taken:
	<select name="subject">
		 <option value="dropdown"> </option>
         <%
         
 		String instr=request.getParameter("instructor");
 		session.setAttribute("instructor",instr);
 	    
 		
        List<String> lst1=new CollegeCRUD().subjectList(instr);
		for(String s : lst1){
	%>
	<option value=<%=s %>><%=s%></option>
	<%
		}
	%>
	
	</select>
	
	
	
	 <%
  	    session.setAttribute("subject",request.getParameter("subject"));
     %>
</center>
</form>
<form method="get" action="Dashboard.jsp">
<br/><br/>
<input type="submit" value="Show"/> 
</form>
<script>
        function change(){
          
           document.frmFeedback.submit();
     
        }
        </script>
</body>
</html>