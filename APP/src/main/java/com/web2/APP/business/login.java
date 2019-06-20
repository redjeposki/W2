package com.web2.APP.business;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/login")
public class login {
	
	@GET
	@Produces("text/plain")
	public String showIt() {
		return "this is login page";
	}
}
