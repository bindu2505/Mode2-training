<%@page import="com.hcl.college.FbResult"%>
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
<form method="get" action="Dashboard.jsp">
	<table border="3">
	
	<tr>
	<th>FeedbackValue</th>
	<th>Count</th>
	</tr>
	
	<%
String instructor=(String)session.getAttribute("instructor");
String sub=(String)session.getAttribute("subject");
out.println(instructor+sub);
List<FbResult> lst=new CollegeCRUD().feedbackList(instructor, sub);
for(FbResult fr : lst) {
%>
<tr>
<td> <%=fr.getFbvalue() %></td>
<td><%=fr.getCount() %> </td>
<%
}
%>
</tr>
	</table>
	
</form>
</body>
</html>