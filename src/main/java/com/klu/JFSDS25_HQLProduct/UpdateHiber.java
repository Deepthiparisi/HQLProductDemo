package com.klu.JFSDS25_HQLProduct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateHiber {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		
		Transaction t = s.beginTransaction();
		
		
		
		
		
		t.commit();
		sf.close();
		s.close();

	}

}
