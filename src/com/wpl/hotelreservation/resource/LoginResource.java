package com.wpl.hotelreservation.resource;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;
import com.wpl.hotelreservation.model.Login;
import com.wpl.hotelreservation.model.UserInfo;

public class LoginResource extends ActionSupport{
	String cust_password;
	String cust_email;
	
	
	/**
	 * @return the cust_password
	 */
	public String getCust_password() {
		return cust_password;
	}
	/**
	 * @param cust_password the cust_password to set
	 */
	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}
	/**
	 * @return the cust_email
	 */
	public String getCust_email() {
		return cust_email;
	}
	/**
	 * @param cust_email the cust_email to set
	 */
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	
	public String verifylogin(Login login) {
		setCust_email(login.getCustomer_email());
		setCust_password(login.getPassword());
		
		Configuration config = new AnnotationConfiguration();
		SessionFactory sessionFactory=config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("FROM UserInfo WHERE customer_email = :email and customer_password = :pass");
		query.setParameter("email", cust_email);
		query.setParameter("pass",cust_password);
		
		UserInfo user=null;
		List data = query.list();
		if(!data.isEmpty()){
			for (Iterator iterator = data.iterator(); iterator.hasNext();){
				user =  (UserInfo) iterator.next();
				if(cust_email.equals(user.getCustomer_email()) && cust_password.equals(user.getPassword())){
					System.out.println("login checked");
					session.save(login);
				}
				System.out.print("email " + user.getCustomer_email()); 
				System.out.println("  Password: " + user.getPassword()); 
		}
			
		if(!tx.wasCommitted())
			tx.commit();					
		session.close();
		return "success";
		
	}
		else{
			return "failure";
		}

 }

}
