package com.app;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/enter")
public class Message {
@Path("/msg")
@POST
@Consumes("application/xml")
	public String getMsg(Employee e) {
		return "Hello  "+e.getEmpId()+"your name is:  "+e.getEmpName()+"  and your salary is:  "+e.getEmpSal();
		
	}
}
