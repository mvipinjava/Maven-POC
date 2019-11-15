package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/product")
public class Client {
	Product p = null;
	@Path("/get")
	@GET
	public Response getProduct(@QueryParam("pid")Integer pid,
			@QueryParam("prodName")String pname,
			@QueryParam("prodCost")String pcost) {
		p = new Product();
		p.setProdId(101);
		p.setProdName("Java Book");
		p.setProdCost("250.25");
		return Response.status(200).entity(p).build();

	}
}
