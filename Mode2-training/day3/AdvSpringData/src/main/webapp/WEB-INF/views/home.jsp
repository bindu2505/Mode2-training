<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.dropbtn {
  background-color: #3498DB;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropbtn:hover, .dropbtn:focus {
  background-color: #2980B9;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  overflow: auto;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown a:hover {background-color: #ddd;}

.show {display: block;}
</style>





<title>Student Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employ List</h1>
		
		<table border="1">
			<th>Empno</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Desig</th>
			<th>Basic</th>

			<c:forEach var="employ" items="${employList}">
				<tr>

					<td>${employ.empno}</td>
					<td>${employ.name}</td>
					<td>${employ.dept}</td>
					<td>${employ.desig}</td>
					<td>${employ.basic}</td>
					
				</tr>
			</c:forEach>
		</table>
		
		<c:set var="num" value="${pages }"/>
<div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Dropdown</button>
  <div id="myDropdown" class="dropdown-content">
<%
int n=((Integer)pageContext.getAttribute("num")).intValue();
for(int i=0;i<n;i++){
%>


   <a href="/displayAll/Page/<%=i%>"><%=i+1 %></a>&nbsp;&nbsp;
 
               
<%
}
%>
</div>




<script type="text/javascript">
/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>

		
	
		<!-- <a href="/displayjavacontractors">Display java contractors</a><br/>
		<a href="/displaydotnetcontractors">Display dotnet contractors</a><br/>
		<a href="/displaymanagercontractors">Display manager contractors</a><br/>
		<a href="/displaysalcontractors">Display contractors whose sal>1000000</a><br/>
		<a href="/displaycontractors">Display contractors starting with n</a><br/>
		<a href="/displayAllSortByDesig">Display contractors in sorted list</a><br/>
		<a href="/displayAllSortByDesigDescending">Display contractors in sorted descending list</a><br/>
		<a href="/displayAllSortByDeptAndSalDescending">Display contractors in sorted descending list of sal and dept</a><br/>
		<a href="/displaySortByStudentAndSal">Display students in sorted descending list of sal</a><br/>
		<a href="/displaySortByStudentAndSalwithN">Display students in sorted descending list of sal starting with N</a>-->		
		<!-- <a href="/displayAll/Page/0">Page 1</a>
		<a href="/displayAll/Page/1">Page 2</a>
		<a href="/displayAll/Page/2">Page 3</a>
		<a href="/displayAll/Page/3">Page 4</a>
		 -->
		 <%-- <c:set var="num" value="${pages}" />
		<%
		int n=((Integer)pageContext.getAttribute("num")).intValue();
		for(int i=0;i<n;i++){
			%>
					<a href="/displayAll/Page/<%=i%>">Page <%=i+1 %></a>
			<% 
		}
		%>
 --%>	   <a href="/">Home</a> 
	</div>
</body>
</html>