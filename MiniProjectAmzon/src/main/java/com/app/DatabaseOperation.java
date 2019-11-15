package com.app;

import java.util.List;

import javax.ws.rs.QueryParam;

public interface DatabaseOperation {
	public String createTx(CustomerAmazon ci);
	public List<CustomerAmazon> viewAllTx();
	public CustomerAmazon getOneTx(@QueryParam("txid") String id);
}
