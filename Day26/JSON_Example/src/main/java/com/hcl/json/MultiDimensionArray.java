package com.hcl.json;

import java.util.Scanner;

import org.json.simple.JSONArray;

public class MultiDimensionArray {
	public static void main(String[] args) {
		JSONArray obj=new JSONArray();
		for(int i=0;i<2;i++){
			  JSONArray arr = new JSONArray();  
			  Scanner sc=new Scanner(System.in);
			  System.out.println("enter name");
			  String name=sc.nextLine();
			  System.out.println("enter salary");
			  int sal=sc.nextInt();
			  System.out.println("Enter age");
			  int age=sc.nextInt();
			  
			  
			  arr.add(name);    
			  arr.add(sal);    
			  arr.add(age);  
			  obj.add(i,arr);
		}
		System.out.println(obj);
	}

}
