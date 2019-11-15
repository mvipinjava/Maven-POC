package com.app;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;
@Path("/emp")
public class EmployeeProvider {
@POST
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getEmployeeDetails() {
		ResponseBuilder rb = new ResponseBuilderImpl();
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("vipin");
		emp.setEmpSal("5.5");
		return rb.entity(emp).build();
		
	}
}
