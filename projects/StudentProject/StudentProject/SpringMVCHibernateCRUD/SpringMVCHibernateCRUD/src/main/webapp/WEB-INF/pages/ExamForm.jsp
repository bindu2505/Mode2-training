<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
       
        <form:form action="saveExam" method="post" commandName="exam">
         <h1>New Exam Details Form for the student:<%=request.getParameter("name") %></h1>
        <table>
        <form:hidden path="examId"/>
        <form:hidden path="id"/>
       		<%-- <tr><td>Student ID:</td>
                <td><form:input path="id"/></td></tr>
             <tr> --%>
             <tr>
             	<td>Subject name:</td>
                <td>
                  <form:select path = "subName">
                     <form:option value = "Core Java">Core Java</form:option>
                     <form:option value = "SQL">SQL</form:option>
                     <form:option value = "Spring">Spring</form:option>
                     <form:option value = " HTML">HTML</form:option>
                      </form:select>    
               </td>
            </tr> 
            <tr>        
                <td>Marks:</td>
                <td><form:input path="mark" /></td>
            </tr>
            <tr>
               
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
            </table>
            <h4><a href="examShow?id=${exam.id }&name=<%=request.getParameter("name")%>">Show</a></h4>
        
        </form:form>
    </div>
     
    </body>
</html>
