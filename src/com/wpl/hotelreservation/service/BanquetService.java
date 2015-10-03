package com.wpl.hotelreservation.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import com.wpl.hotelreservation.model.Banquet_hall;
import com.wpl.hotelreservation.resource.BanquetResource;

@Path("/banquethall")
public class BanquetService {

	@POST
	@Path("/book")
	public String addBanquet(
			@FormParam(value="email") String cust_email,
			@FormParam(value="hall_type") String type_of_hall,
			@FormParam(value="checkindate") String checkin_date,
			@FormParam(value="checkoutdate") String checkout_date){	
		Banquet_hall bh = new Banquet_hall();
		BanquetResource br = new BanquetResource();
		System.out.println("BanquetService entered");
		bh.setBanquet_status(true);
		bh.setBanquet_type(type_of_hall);
		bh.setCheckin_date(checkin_date);
		bh.setCheckout_date(checkout_date);
		br.addBanquet(bh);
		return "success";
				
		
	}
}
