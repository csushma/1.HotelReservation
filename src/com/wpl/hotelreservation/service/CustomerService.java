package com.wpl.hotelreservation.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.wpl.hotelreservation.model.Login;
import com.wpl.hotelreservation.model.UserInfo;
import com.wpl.hotelreservation.resource.CustomerResource;
import com.wpl.hotelreservation.resource.LoginResource;

@Path("/userinfo")
public class CustomerService {
	
	@POST
	@Path("/register")
	public String addUser(
			@FormParam(value = "name") String name,
			@FormParam(value = "email") String email,
			@FormParam(value = "password") String password,
			@FormParam(value = "mobile") long mobile){
		CustomerResource cr = new CustomerResource();
		UserInfo ui = new UserInfo();
		ui.setCustomer_name(name);
		ui.setCustomer_email(email);
		ui.setPassword(password);
		ui.setCustomer_phone(mobile);
		cr.addUser(ui);
		return "success";			
	}
	
	@POST
	@Path("/signin")
	public String getUser(
			@FormParam(value = "username") String customer_email,
			@FormParam(value = "userpassword") String customer_password){	
		System.out.println("entered sign");
		LoginResource lr= new LoginResource();
		Login login = new Login();
		login.setCustomer_email(customer_email);
		login.setPassword(customer_password);
		lr.verifylogin(login);
	//	lr.logout(login);
		return "success";		
	}

}
