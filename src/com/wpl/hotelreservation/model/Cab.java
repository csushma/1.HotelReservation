package com.wpl.hotelreservation.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="cab")
public class Cab implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name="cab_id")
	private int cab_id;
	
/*	@OneToOne
    @JoinColumn(name = "customer_id")
	private UserInfo customer;
*/
	@Column(name="location")
	private String location;
	
	//@Temporal (TemporalType.DATE)
	@Column(name="date")
	private String date;
	
	@Column(name="time")
	private String time;
	
	@Column(name="type_of_car")
	private String type_of_car;
	
	@Column(name="cab_status")
	private boolean cab_status;



	/**
	 * @return the cab_id
	 */
	public int getCab_id() {
		return cab_id;
	}

	/**
	 * @param cab_id the cab_id to set
	 */
	public void setCab_id(int cab_id) {
		this.cab_id = cab_id;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param pickupdate the date to set
	 */
	public void setDate(String pickupdate) {
		this.date = pickupdate;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param pickuptime the time to set
	 */
	public void setTime(String pickuptime) {
		this.time = pickuptime;
	}

	/**
	 * @return the type_of_car
	 */
	public String getType_of_car() {
		return type_of_car;
	}

	/**
	 * @param type_of_car the type_of_car to set
	 */
	public void setType_of_car(String type_of_car) {
		this.type_of_car = type_of_car;
	}

	/**
	 * @return the cab_status
	 */
	public boolean isCab_status() {
		return cab_status;
	}

	/**
	 * @param cab_status the cab_status to set
	 */
	public void setCab_status(boolean cab_status) {
		this.cab_status = cab_status;
	}
	
	
}
