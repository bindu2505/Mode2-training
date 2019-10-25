package com.bindu.samples.java8;

public class MultiInterfaceClass {
	public static void main(String[] args) {
		MultiInterface multiInterface=(String name)->{return "Hi "+ name;};
		String name1=multiInterface.sayHello("Bindu");
		System.out.println(name1);
		
		System.out.println(MultiInterface.add(12, 2));
		
		System.out.println(multiInterface.defaultMethod(15));
		
		MultiInterface multiInterface2=(name)->(name+"Bindu");
		System.out.println(multiInterface.equals(multiInterface2));
	}
}
