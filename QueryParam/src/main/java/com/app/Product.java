package com.app;

public class Product {
private int prodId;
private String prodName;
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Product [prodId=");
	builder.append(prodId);
	builder.append(", prodName=");
	builder.append(prodName);
	builder.append("]");
	return builder.toString();
}

}
