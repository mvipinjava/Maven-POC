package com.sreenu.com;

//import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;

public class Student {
private Integer stdId;
private String sName;
private String scourse;
public Integer getStdId() {
	return stdId;
}
public void setStdId(Integer stdId) {
	this.stdId = stdId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getScourse() {
	return scourse;
}
public void setScourse(String scourse) {
	this.scourse = scourse;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Student [stdId=");
	builder.append(stdId);
	builder.append(", sName=");
	builder.append(sName);
	builder.append(", scourse=");
	builder.append(scourse);
	builder.append("]");
	return builder.toString();
}

}
