package com.bindu.samples.java8;



public interface DefaultInterface {
	default void printHello(){
		System.out.println("Hello Default");
	}
	
	static void sayHello(){
		System.out.println("Hello Static");
	}
}
