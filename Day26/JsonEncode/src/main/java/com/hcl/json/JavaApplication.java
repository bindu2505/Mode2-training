package com.hcl.json;




import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.hcl.model.Employee;

public class JavaApplication {

@SuppressWarnings("unchecked")
 public static void main(String[] args) {

StringBuilder contentBuilder = new StringBuilder();
    try (Stream<String> stream = Files.lines( Paths.get("C:\\Users\\Coalesce\\Desktop\\employee.json"), StandardCharsets.UTF_8))
    {
        stream.forEach(s -> contentBuilder.append(s));
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    String s= contentBuilder.toString();
    JSONObject jsonObject = (JSONObject)JSONValue.parse(s);
    JSONObject obj2=(JSONObject) jsonObject.get("employees");
   
    JSONArray arr=(JSONArray)obj2.get("employee");
    List<Employee> lst=new ArrayList<Employee>();
    
 for(int i=0;i<arr.size();i++){
	 Employee employee=new Employee();
 JSONObject a=(JSONObject) arr.get(i);
 long empno = (long) a.get("empno");
 employee.setEmpNo(empno);
 
   String empName = (String) a.get("empname");
   employee.setEmpName(empName);
   long salary = (long) a.get("salary");
   employee.setSalary(salary);
   
   
   String dateOfJoin = (String) a.get("dateofjoin");  
   employee.setDateOfJoin(dateOfJoin);
   String band = (String) a.get("band");
   employee.setBand(band);
   System.out.println(empno+" "+empName+" "+salary+" "+dateOfJoin+" "+band+" ");
   lst.add(employee);
 }
 lst.forEach(var->System.out.println(var));  
 }

}
