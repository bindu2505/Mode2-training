package helloservice.endpoint;

import java.rmi.RemoteException;

public class MainApp {
	public static void main(String[] args) {
		
	
	HelloProxy proxy=new HelloProxy();
	String m;
	try {
		m=proxy.sayHello("Bindu");
		System.out.println(m);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
