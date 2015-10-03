package com.wpl.hotelreservation.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="login")
public class Login{

	
	@Id
	@Column(name="customer_email")
	private String customer_email;
	
	@Column(name="customer_password")
	private String customer_password;

	/**
	 * @return the customer_email
	 */
	public String getCustomer_email() {
		return customer_email;
	}

	/**
	 * @param customer_email the customer_email to set
	 */
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return customer_password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.customer_password = password;
	}
	
	
}
