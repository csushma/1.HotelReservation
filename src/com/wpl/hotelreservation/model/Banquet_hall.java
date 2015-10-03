package com.wpl.hotelreservation.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="banquethall")
public class Banquet_hall implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
//	@Column(length=2)
	private int banquet_id;
	
	@Column(name="checkin_date")
	private String checkin_date;
	
	@Column(name="checkout_date")
	private String checkout_date;
	
	@Column(name="banquet_type")
	private String banquet_type;
	
	@Column(name="banquet_status")
	private boolean banquet_status;

	/**
	 * @return the banquet_id
	 */
	public int getBanquet_id() {
		return banquet_id;
	}

	/**
	 * @param banquet_id the banquet_id to set
	 */
	public void setBanquet_id(int banquet_id) {
		this.banquet_id = banquet_id;
	}


	/**
	 * @return the checkin_date
	 */
	public String getCheckin_date() {
		return checkin_date;
	}

	/**
	 * @param checkin_date the checkin_date to set
	 */
	public void setCheckin_date(String checkin_date) {
		this.checkin_date = checkin_date;
	}

	/**
	 * @return the checkout_date
	 */
	public String getCheckout_date() {
		return checkout_date;
	}

	/**
	 * @param checkout_date the checkout_date to set
	 */
	public void setCheckout_date(String checkout_date) {
		this.checkout_date = checkout_date;
	}

	/**
	 * @return the banquet_type
	 */
	public String getBanquet_type() {
		return banquet_type;
	}

	/**
	 * @param banquet_type the banquet_type to set
	 */
	public void setBanquet_type(String banquet_type) {
		this.banquet_type = banquet_type;
	}

	/**
	 * @return the banquet_status
	 */
	public boolean isBanquet_status() {
		return banquet_status;
	}

	/**
	 * @param banquet_status the banquet_status to set
	 */
	public void setBanquet_status(boolean banquet_status) {
		this.banquet_status = banquet_status;
	}
	
	
}
