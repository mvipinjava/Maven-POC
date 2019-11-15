package com.app.byke;

public class Byke {
private Integer bykeBrand;
private String bykeName;
private String bykeModelNum;
private String bykeNumber;
private String bykeOwner;
private Double bykeCost;
private Bank bankDetails;
public Byke() {
	super();
}
public Integer getBykeBrand() {
	return bykeBrand;
}
public void setBykeBrand(Integer bykeBrand) {
	this.bykeBrand = bykeBrand;
}
public String getBykeName() {
	return bykeName;
}
public void setBykeName(String bykeName) {
	this.bykeName = bykeName;
}
public String getBykeModelNum() {
	return bykeModelNum;
}
public void setBykeModelNum(String bykeModelNum) {
	this.bykeModelNum = bykeModelNum;
}
public String getBykeNumber() {
	return bykeNumber;
}
public void setBykeNumber(String bykeNumber) {
	this.bykeNumber = bykeNumber;
}
public String getBykeOwner() {
	return bykeOwner;
}
public void setBykeOwner(String bykeOwner) {
	this.bykeOwner = bykeOwner;
}
public Double getBykeCost() {
	return bykeCost;
}
public void setBykeCost(Double bykeCost) {
	this.bykeCost = bykeCost;
}
public Bank getBankDetails() {
	return bankDetails;
}
public void setBankDetails(Bank bankDetails) {
	this.bankDetails = bankDetails;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Byke [bykeBrand=");
	builder.append(bykeBrand);
	builder.append(", bykeName=");
	builder.append(bykeName);
	builder.append(", bykeModelNum=");
	builder.append(bykeModelNum);
	builder.append(", bykeNumber=");
	builder.append(bykeNumber);
	builder.append(", bykeOwner=");
	builder.append(bykeOwner);
	builder.append(", bykeCost=");
	builder.append(bykeCost);
	builder.append(", bankDetails=");
	builder.append(bankDetails);
	builder.append("]");
	return builder.toString();
}


}
