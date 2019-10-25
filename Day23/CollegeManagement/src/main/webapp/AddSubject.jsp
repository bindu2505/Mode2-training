<%@page import="com.hcl.college.CollegeCRUD"%>
<%@page import="com.hcl.college.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AddSubject.jsp" name="productForm">
            <select name="subject" id="dropdown" onchange="change()">
                <option value="dropdown">Pls select one</option>
                <option value="PC1">PC1</option>
                <option value="PC2">PC2</option>
                <option value="PC3">PC3</option>
                <option value="Microprocessor ">Microprocessor </option>
                <option value="C#">C#</option>
                <option value="Operating ">Operating </option>
                <option value="SQL ">SQL </option>
                <option value="Networking">Networking</option>
                
            </select>
            <br/><br/>
            Theory : 
            <input type="text" name="theory" id="theory" readonly="readonly" /> <br/><br/>
            Practical : 
            <input type="text" name="practical" id="practical" readonly="readonly" /> <br/><br/>
            <input type="submit" value="click">
            Year:
            <input type="number" name="year">
            Instructor:
            <input type="text" name="instructor">
            
        </form>
        
        <script>
        function change(){
        var dval= document.getElementById("dropdown").value;
        
       
        if(dval =="PC1 "){
        	//alert("hi");
        	productForm.theory.value="42";
        	productForm.practical.value="14";
        }
        if(dval =="PC2"){
        	//alert("hi");
        	productForm.theory.value="90";
        	productForm.practical.value="50";
        }
        if(dval =="PC3"){
        	//alert("hi");
        	productForm.theory.value="69";
        	productForm.practical.value="41";
        }
        
        if(dval =="PC4"){
        	//alert("hi");
        	productForm.theory.value="69";
        	productForm.practical.value="41";
        }
        
        if(dval =="Microprocessor "){
        	//alert("hi");
        	productForm.theory.value="107";
        	productForm.practical.value="93";
        }
        
        if(dval =="C#"){
        	//alert("hi");
        	productForm.theory.value="84";
        	productForm.practical.value="56";
        }
        
        if(dval =="Data "){
        	//alert("hi");
        	productForm.theory.value="60";
        	productForm.practical.value="0";
        }
        
        if(dval =="Operating "){
        	//alert("hi");
        	productForm.theory.value="80";
        	productForm.practical.value="70";
        }
        
        if(dval =="SQL "){
        	//alert("hi");
        	productForm.theory.value="66";
        	productForm.practical.value="34";
        }
        
        if(dval =="Networking"){
        	//alert("hi");
        	productForm.theory.value="94";
        	productForm.practical.value="156";
        }
        
        }
   
        </script>
    <%
		if(request.getParameter("theory")!= null && 
		request.getParameter("practical")!= null && 
		request.getParameter("year")!= null && 
		request.getParameter("instructor")!= null && 
		request.getParameter("subject")!= null){
			Subject e=new Subject();
			e.setSubject(request.getParameter("subject"));
			e.setPractical(Integer.parseInt(request.getParameter("practical")));
			e.setTheory(Integer.parseInt(request.getParameter("theory")));
			e.setYear(Integer.parseInt(request.getParameter("year")));
			e.setInstructor(request.getParameter("instructor"));
			CollegeCRUD i=new CollegeCRUD();
			out.println(i.insertSubject(e));
		}
	%>
    
  
</form>
</body>
</html>