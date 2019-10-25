package com.bindu.samples.java8;

public class MyInterfaceImpl implements DefaultInterface {
	public static void main(String[] args) {
		new MyInterfaceImpl().printHello();
		DefaultInterface.sayHello();
	}
}
