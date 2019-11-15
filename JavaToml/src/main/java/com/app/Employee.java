package com.app;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
private String empId;
private String eName;
private String empSal;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String getEmpSal() {
	return empSal;
}
public void setEmpSal(String empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Employee [empId=");
	builder.append(empId);
	builder.append(", eName=");
	builder.append(eName);
	builder.append(", empSal=");
	builder.append(empSal);
	builder.append("]");
	return builder.toString();
}

}
