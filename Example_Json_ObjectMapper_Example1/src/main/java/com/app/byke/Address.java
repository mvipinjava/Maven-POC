package com.app.byke;

public class Address {
private String city;
private String street;
private String landMark;
private Integer pincode;
private String State;
public Address() {
	super();
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getLandMark() {
	return landMark;
}
public void setLandMark(String landMark) {
	this.landMark = landMark;
}
public Integer getPincode() {
	return pincode;
}
public void setPincode(Integer pincode) {
	this.pincode = pincode;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + street + ", landMark=" + landMark + ", pincode=" + pincode
			+ ", State=" + State + "]";
}

}
