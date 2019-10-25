package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Employ");
	 q=s.getNamedQuery("HQL_GET_ALL_EMPLOY");
	List<Employ> employ=(List<Employ>)q.list();
	for (Employ employ2 : employ) {
		System.out.println(employ2);
	}
    q=s.createQuery("from Employ");
	 q=s.getNamedQuery("SQL_GET_ALL_EMPLOY");
	List<Employ> employ1=(List<Employ>)q.list();
	for (Employ employ2 : employ1) {
		System.out.println(employ2);
	}
	sf.close();
	

	}
}
