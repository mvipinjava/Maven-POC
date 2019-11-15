package com.app.byke;

import java.util.List;
import java.util.Map;

public class CustomerDetails {
//private Map<Integer, String> custName;
	private String custName;
private List<Bank> bankDetails;
public CustomerDetails() {
	super();
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public List<Bank> getBankDetails() {
	return bankDetails;
}
public void setBankDetails(List<Bank> bankDetails) {
	this.bankDetails = bankDetails;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("CustomerDetails [custName=");
	builder.append(custName);
	builder.append(", bankDetails=");
	builder.append(bankDetails);
	builder.append("]");
	return builder.toString();
}





}
