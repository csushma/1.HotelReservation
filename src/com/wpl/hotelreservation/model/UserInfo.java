package com.wpl.hotelreservation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class UserInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	@Column(name="customer_id")
	private int customer_id;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(unique=true)
	private String customer_email;
	
	@Column(name="customer_password")
	private String customer_password;
	
	@Column(name="customer_phone")
	private long customer_phone;

	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}

	/**
	 * @param customer_name the customer_name to set
	 */
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

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

	/**
	 * @return the customer_phone
	 */
	public long getCustomer_phone() {
		return customer_phone;
	}

	/**
	 * @param customer_phone the customer_phone to set
	 */
	public void setCustomer_phone(long customer_phone) {
		this.customer_phone = customer_phone;
	}
	
	
	
}
