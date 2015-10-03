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
@Table(name="room")
public class Room implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name="roomno")
	private int roomno;
/*	
	@OneToOne
    @JoinColumn(name = "customer_id")
	private UserInfo customer;
	*/
	@Column(name="checkin_date")
	private String checkin_date;
	
	@Column(name="checkout_date")
	private String checkout_date;
	
	@Column(name="no_of_people")
	private String no_of_people;
	
	@Column(name="no_of_children")
	private String no_of_children;
	
	@Column(name="no_of_rooms")
	private String no_of_rooms;
	
	@Column(name="booking_status")
	private boolean booking_status;

	@Column(name="type_of_room")
	private String type_of_room;
	
	

	/**
	 * @return the type_of_room
	 */
	public String getType_of_room() {
		return type_of_room;
	}

	/**
	 * @param type_of_room the type_of_room to set
	 */
	public void setType_of_room(String type_of_room) {
		this.type_of_room = type_of_room;
	}

	/**
	 * @return the roomno
	 */
	public int getRoomno() {
		return roomno;
	}

	/**
	 * @param roomno the roomno to set
	 */
	public void setRoomno(int roomno) {
		this.roomno = roomno;
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
	 * @return the no_of_people
	 */
	public String getNo_of_people() {
		return no_of_people;
	}

	/**
	 * @param no_of_people the no_of_people to set
	 */
	public void setNo_of_people(String no_of_people) {
		this.no_of_people = no_of_people;
	}

	/**
	 * @return the no_of_children
	 */
	public String getNo_of_children() {
		return no_of_children;
	}

	/**
	 * @param no_of_children the no_of_children to set
	 */
	public void setNo_of_children(String no_of_children) {
		this.no_of_children = no_of_children;
	}

	/**
	 * @return the no_of_rooms
	 */
	public String getNo_of_rooms() {
		return no_of_rooms;
	}

	/**
	 * @param no_of_rooms the no_of_rooms to set
	 */
	public void setNo_of_rooms(String no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	/**
	 * @return the booking_status
	 */
	public boolean isBooking_status() {
		return booking_status;
	}

	/**
	 * @param booking_status the booking_status to set
	 */
	public void setBooking_status(boolean booking_status) {
		this.booking_status = booking_status;
	}

	public Room(){
		
	}
	/**
	 * @param roomno
	 * @param checkin_date
	 * @param checkout_date
	 * @param no_of_people
	 * @param no_of_children
	 * @param no_of_rooms
	 * @param booking_status
	 */
	public Room(int roomno, String checkin_date, String checkout_date,
			String no_of_people, String no_of_children, String no_of_rooms,
			boolean booking_status) {
		super();
		this.roomno = roomno;
		this.checkin_date = checkin_date;
		this.checkout_date = checkout_date;
		this.no_of_people = no_of_people;
		this.no_of_children = no_of_children;
		this.no_of_rooms = no_of_rooms;
		this.booking_status = booking_status;
	}
	
	
	
}
