package com.bindu.fi;

public interface MethodReferenceStatic {
	public String sayHello(Integer s);
	public static String someMethod(int num){
		return "welcome static : "+ num;
	}
}
