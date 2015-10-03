package com.wpl.hotelreservation.resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import com.wpl.hotelreservation.model.Room;

public class RoomResource {
	
	public String addRoom(Room r){
		Configuration config = new AnnotationConfiguration();
		SessionFactory sessionFactory=config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(r);
		if(!tx.wasCommitted())
			tx.commit();					
		session.close();
		return "success";
	}

}
