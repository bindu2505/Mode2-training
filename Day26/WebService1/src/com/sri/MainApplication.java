package com.sri;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
		int res=0;
		SriProxy proxy=new SriProxy();
		try {
			res=proxy.getSapCode();
			System.out.println(res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
