package com.wpl.hotelreservation.service;


import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.wpl.hotelreservation.model.Room;
import com.wpl.hotelreservation.resource.RoomResource;

@Path("/room")
public class RoomService {

	@POST
	@Path("/book")
	public String addRoom(
			@FormParam(value = "checkindate") String checkindate,
			@FormParam(value = "typeofroom") String typeofroom,
			@FormParam(value = "no_of_rooms") String no_of_rooms,
			@FormParam(value = "checkoutdate") String checkoutdate,
			@FormParam(value = "no_of_adults") String no_of_adults,
			@FormParam(value = "no_of_children") String no_of_children){
		System.out.println("entered room service");
		Room r = new Room();
		
		r.setCheckin_date(checkindate);
		r.setCheckout_date(checkoutdate);
		r.setNo_of_children(no_of_children);
		r.setNo_of_rooms(no_of_rooms);
		r.setNo_of_people(no_of_adults);
		r.setType_of_room(typeofroom);
		r.setBooking_status(true);
		RoomResource rr= new RoomResource();
		rr.addRoom(r);
		return "success";	
	}
}
