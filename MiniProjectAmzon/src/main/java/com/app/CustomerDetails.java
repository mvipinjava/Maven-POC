package com.app;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
@Path("/details")
public class CustomerDetails implements DatabaseOperation {

	@Override
	public String createTx(CustomerAmazon ci) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerAmazon> viewAllTx() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerAmazon getOneTx(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
