package com.hcl.hib;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsertMain {
	public static void main(String[] args) {
		int empno=0;
		Employ e = new Employ();
		Scanner sc=new Scanner(System.in);
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("Select max(empno) from Employ");
		for(Iterator it=q.iterate();it.hasNext();){
			empno=(Integer)it.next();
		}
		empno++;
		System.out.println(empno);
	}
}
