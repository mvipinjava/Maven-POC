package com.app.beans;

public class Customer {

	private String custId;
	private String custName;
	private String cradNumber;
	private String dob;
	private String balance;
	
	
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	private String emailId;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custId) {
		super();
		this.custId = custId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCradNumber() {
		return cradNumber;
	}

	public void setCradNumber(String cradNumber) {
		this.cradNumber = cradNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [custId=");
		builder.append(custId);
		builder.append(", custName=");
		builder.append(custName);
		builder.append(", cradNumber=");
		builder.append(cradNumber);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append("]");
		return builder.toString();
	}

	
	
}
