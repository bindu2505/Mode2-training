package com.hcl.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonArrayExample {
	public static void main(String args[]){ 
		  JSONObject obj=new JSONObject();
		  for(int i=0;i<2;i++){
		  JSONArray arr = new JSONArray();  
		  arr.add("sonoo");    
		  arr.add(new Integer(27));    
		  arr.add(new Double(600000));  
		  obj.put(i,arr);
		  JSONArray arr1 = new JSONArray(); 
		  arr1.add("Bindu");    
		  arr1.add(new Integer(22));    
		  arr1.add(new Double(98745)); 
		  obj.put(i, arr1);
		  
		  
		  
		 // System.out.print(arr);
		  //System.out.print(arr1);
		}
		  System.out.println(obj);
	}
}
