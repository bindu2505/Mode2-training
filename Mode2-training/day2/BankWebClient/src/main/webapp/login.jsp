<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="login" modelAttribute="login">

<table border="1">
<tr>
<td>User Name:</td>
<td><form:input path="username"/></td>
</tr>
<tr>


<td>PassWord:</td>
<td><form:input path="password"/></td>
</tr>



</table><input type="submit" value="Login">
</form:form>
`</body>
</html>