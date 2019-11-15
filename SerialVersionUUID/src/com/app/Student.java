package com.app;

public class Student {
	/*public int hashCode() {
		return 10;
	}
public static void main(String[] args) {
	Student s1= new Student();
	Student s2= new Student();
	Student s3= new Student();
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println(s3.toString());*/
	
int rollNo;
public int hashCode() {
	return rollNo;
	
	
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Student [rollNo=");
	builder.append(rollNo);
	builder.append("]");
	return builder.toString();
}
public static void main(String[] args) {
	Student s1= new Student();
	s1.setRollNo(101);
	Student s2= new Student();
	s2.setRollNo(102);
	Student s3= new Student();
	System.out.println(s1);
	System.out.println(s2.toString());
	System.out.println(s3.toString());
}
}
