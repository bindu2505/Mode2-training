<%@page import="com.hcl.college.Feedback"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.college.CollegeCRUD"%>
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
	CollegeCRUD c=new CollegeCRUD();
	String fid=c.generateFeedbackId();
	session.setAttribute("fid", fid);
%>
<form method="get" action="feedback.jsp" name="frmFeedback">
<center>
	FeedbackId:
	<input type="text" name="fid" readonly="readonly" value="<%=fid %>" />
	Student Name:
	<input type="text" name="studentname" /><br/><br/>
	
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
		<%
		session.setAttribute("studentName",request.getParameter("studentname"));
		  
  	    session.setAttribute("instructor",request.getParameter("instructor"));

		%>
		
	</form>
		
	<h4>Please give your feedback</h4>	
	
	
	
	
	<form method="get" action="Confirmation.jsp">

	<br/><br/>
	Select Subject:
	<select name="subject">
		 <option value="dropdown"> </option>
         <%
         
 		String instr=request.getParameter("instructor");
 		out.println("Instructor"+instr);
 		session.setAttribute("instructor",instr);
 	    
 		
         List<String> lst1=new CollegeCRUD().subjectList(instr);
		for(String s : lst1){
	%>
	<option value=<%=s %>"><%=s%></option>
	<%
		}
	%>
	
		</select>
		
		
	<input type="radio" id="Type1" name="feedback" value="Excellent">
    <label for="Type1">Excellent</label>

    <input type="radio" id="Type2" name="feedback" value="Good">
    <label for="Type2">Good</label>

    <input type="radio" id="Type3"  name="feedback" value="Adequate">
    <label for="Type3">Adequate</label>

    <input type="radio" id="Type4" name="feedback" value="Inadequate">
    <label for="Type4">Inadequate</label><br/><br/>
	<input type="submit" value="Show" />

		
			
	
	</center>
	
		
</form>
<script>
        function change(){
          
           document.frmFeedback.submit();
     
        }
        </script>
        
        
        
       
   
</body>
</html>