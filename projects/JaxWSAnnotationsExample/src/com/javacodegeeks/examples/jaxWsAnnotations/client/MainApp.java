package com.javacodegeeks.examples.jaxWsAnnotations.client;

import java.rmi.RemoteException;

import com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceIProxy;

public class MainApp {
	public static void main(String[] args) {
		WSAnnotationWebServiceIProxy proxy=new WSAnnotationWebServiceIProxy();
		float res=0;
		try {
			res=proxy.celsiusToFarhenheit(78.9f);
			System.out.println(res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
