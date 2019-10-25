package com.bindu.fi;

public class MethodreferenceStaticMain {
	public static void main(String[] args) {
		MethodReferenceStatic static1=(a)->{return "Welcome  "+a;};
		System.out.println(static1.sayHello(22));
		
		MethodReferenceStatic static2=MethodReferenceStatic::someMethod;
		System.out.println(static2.sayHello(44));
	}
}
