package com.app;

import java.util.List;

public class Product {
private int prodId;
private String prodName;
List<Model> modelObjs;
public Product() {
	super();
}
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
public List<Model> getModelObjs() {
	return modelObjs;
}
public void setModelObjs(List<Model> modelObjs) {
	this.modelObjs = modelObjs;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Product [prodId=");
	builder.append(prodId);
	builder.append(", prodName=");
	builder.append(prodName);
	builder.append(", modelObjs=");
	builder.append(modelObjs);
	builder.append("]");
	return builder.toString();
}

}
