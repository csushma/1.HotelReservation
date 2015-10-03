package com.wpl.hotelreservation.resource;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import com.wpl.hotelreservation.model.Cab;

public class CabResource {
	public String addCab(Cab c)
	{		
		Configuration config = new AnnotationConfiguration();
		SessionFactory sessionFactory=config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		if(!tx.wasCommitted())
			tx.commit();					
		session.close();
		return "success";
	}
}
