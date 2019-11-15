package com.app;

public class CustomerAmazon {
Integer custId;
String custName;
Integer custMobileNumber;
String custAddress;
String productName;
String prodCost;
public CustomerAmazon() {
	super();
}
public CustomerAmazon(Integer custId, String custName, Integer custMobileNumber, String custAddress, String productName,
		String prodCost) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.custMobileNumber = custMobileNumber;
	this.custAddress = custAddress;
	this.productName = productName;
	this.prodCost = prodCost;
}
public Integer getCustId() {
	return custId;
}
public void setCustId(Integer custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public Integer getCustMobileNumber() {
	return custMobileNumber;
}
public void setCustMobileNumber(Integer custMobileNumber) {
	this.custMobileNumber = custMobileNumber;
}
public String getCustAddress() {
	return custAddress;
}
public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProdCost() {
	return prodCost;
}
public void setProdCost(String prodCost) {
	this.prodCost = prodCost;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("CustomerAmazon [custId=");
	builder.append(custId);
	builder.append(", custName=");
	builder.append(custName);
	builder.append(", custMobileNumber=");
	builder.append(custMobileNumber);
	builder.append(", custAddress=");
	builder.append(custAddress);
	builder.append(", productName=");
	builder.append(productName);
	builder.append(", prodCost=");
	builder.append(prodCost);
	builder.append("]");
	return builder.toString();
}


}
