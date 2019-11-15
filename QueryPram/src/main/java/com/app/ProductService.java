package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/prod")
public class ProductService {
Product p = null;
@GET
@Path("/get")
public Response getProduct(@QueryParam ("pid")Integer pid) {
	Product p=null;
	if(pid!=null&&pid.equals(101)) {
	    p=new Product();
		p.setProdId(101);//(101);
		p.setProdName("abc");//("mouse");
	//	p.set(300);
	}
	return Response.status(200).entity(p).build();
	}
}

