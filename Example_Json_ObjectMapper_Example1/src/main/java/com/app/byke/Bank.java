package com.app.byke;

public class Bank {
private String bankName;
private Integer bankCode;
private String bankIfsc;
private Address bankAddr;
public Bank() {
	super();
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Integer getBankCode() {
	return bankCode;
}
public void setBankCode(Integer bankCode) {
	this.bankCode = bankCode;
}
public String getBankIfsc() {
	return bankIfsc;
}
public void setBankIfsc(String bankIfsc) {
	this.bankIfsc = bankIfsc;
}
public Address getBankAddr() {
	return bankAddr;
}
public void setBankAddr(Address bankAddr) {
	this.bankAddr = bankAddr;
}
@Override
public String toString() {
	return "Bank [bankName=" + bankName + ", bankCode=" + bankCode + ", bankIfsc=" + bankIfsc + ", bankAddr=" + bankAddr
			+ "]";
}

}
