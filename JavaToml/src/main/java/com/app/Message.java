package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/enter")
public class Message {
	@Path("/msg")
	@GET
	@Produces(MediaType.APPLICATION_XML)
public Employee getMsg() {
	Employee e = new Employee();
	e.setEmpId("123");
	e.seteName("vipin");
	e.setEmpSal("5.5");
	return e;
}
}
