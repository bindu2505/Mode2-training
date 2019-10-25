package com.bindu;

import java.rmi.RemoteException;

import com.jaanu.JananiDemoProxy;
import com.sri.SriProxy;

public class MainApp {
	public static void main(String[] args) {
		
	
	int res=0,
	res1=0,
	res2=0;
	CalculatorProxy proxy = new CalculatorProxy();
	SriProxy proxy2=new SriProxy();
	JananiDemoProxy proxy3=new JananiDemoProxy();
	try {
		res1=proxy2.getSapCode();
		System.out.println(res1);
		res2=proxy3.getInt();
		System.out.println(res2);
		res=proxy.add(res1, res2);
		System.out.println(res);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}
