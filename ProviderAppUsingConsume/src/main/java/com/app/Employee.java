package com.app;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
private String empId;
private String empName;
private String empSal;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
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
	builder.append(", empName=");
	builder.append(empName);
	builder.append(", empSal=");
	builder.append(empSal);
	builder.append("]");
	return builder.toString();
}

}
