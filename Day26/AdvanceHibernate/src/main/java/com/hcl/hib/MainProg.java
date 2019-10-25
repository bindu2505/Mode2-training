package com.hcl.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class MainProg {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		q.setFirstResult(1);
		q.setMaxResults(4);
		List list=q.list();
		
		
		Criteria c=s.createCriteria(Employ.class);
		c.add(Restrictions.gt("basic",52234));
		
		//c.addOrder(Order.asc("basic"));
		List list2=c.list();
		
		
		for (Object ob : list) {
			Employ e=(Employ)ob;
			System.out.println("Empno " +e.getEmpno());
			System.out.println("Name " +e.getName());
			System.out.println("Dept "+e.getDept());
			System.out.println("Desig "+e.getDesig());
			System.out.println("Salary "+e.getBasic());
			System.out.println("-------------");
}
		System.out.println("---------------new records-------------");
		System.out.println();
		
		
		for (Object object : list2) {
			Employ e=(Employ)object;
			System.out.println("Empno " +e.getEmpno());
			System.out.println("Name " +e.getName());
			System.out.println("Dept "+e.getDept());
			System.out.println("Desig "+e.getDesig());
			System.out.println("Salary "+e.getBasic());
			System.out.println("-------------");
		}
		
		Criteria c3=s.createCriteria(Employ.class);
		c3.setProjection(Projections.property("name"));
		List<String> list3=c3.list();
		for (String string : list3) {
			System.out.println("Name "+string);
		}

		
	}

}
