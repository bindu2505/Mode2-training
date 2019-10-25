package com.fault;

import java.rmi.RemoteException;

public class MainApp {
	public static void main(String[] args) {
		
	
	HelloWorldProxy proxy=new HelloWorldProxy();
	String r;
	try {
		r=proxy.sayHello("Bindu");
		System.out.println(r);
	} catch (MissingName e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
