package com.app;

public class Product {
private Integer prodId;
private String prodName;
private String prodCost;
public Integer getProdId() {
	return prodId;
}
public void setProdId(Integer prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
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
	builder.append("Product [prodId=");
	builder.append(prodId);
	builder.append(", prodName=");
	builder.append(prodName);
	builder.append(", prodCost=");
	builder.append(prodCost);
	builder.append("]");
	return builder.toString();
}

}
