package com.wpl.hotelreservation.service;


import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


import com.wpl.hotelreservation.model.Cab;
import com.wpl.hotelreservation.resource.CabResource;

@Path("/cab")
public class CabService {
	
	@POST
	@Path("/book")
	public String addCab(
				@FormParam(value="location") String location,
				@FormParam(value="pickupdate") String pickupdate,
				@FormParam(value="cartype") String cartype,
				@FormParam(value="pickuptime") String pickuptime){
		Cab c = new Cab();
		CabResource cr = new CabResource();
		System.out.println("Cabservice entered");
		c.setCab_status(true);
		c.setLocation(location);
		c.setDate(pickupdate);
		c.setTime(pickuptime);
		c.setType_of_car(cartype);
		cr.addCab(c);
		return "success";
		
	}

}
