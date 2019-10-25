package com.bindu.fi;

public class InstantMethodMain {
	public static void main(String[] args) {
		
	
	InstanceInterface interface1=()->{System.out.println("hi");};
	interface1.myInterface();
	
	InstantMethodReference s=new InstantMethodReference();
	InstanceInterface interface2=s::saySomething;
	interface2.myInterface();
	
	
	}
}
