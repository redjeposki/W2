package com.web2.APP.business;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/register")
public class register {
	@GET
	@Produces("text/plain")
	public String showIt() {
		return "this is register page";
	}
}
