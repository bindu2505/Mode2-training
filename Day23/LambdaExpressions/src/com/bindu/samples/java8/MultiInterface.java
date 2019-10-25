package com.bindu.samples.java8;

@FunctionalInterface
public interface MultiInterface {
	public String sayHello(String name);
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	boolean equals(Object object);
		
	default public int defaultMethod(int var){
		return var+100;
	}

}
