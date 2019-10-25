package com.jaanu;

import java.rmi.RemoteException;

public class MainAppliaction {
	public static void main(String[] args) {
		JananiDemoProxy demoProxy=new JananiDemoProxy();
		int res=0;
		try {
			res=demoProxy.getInt();
			System.out.println(res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
