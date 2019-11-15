package com.app;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Plane {
int plainId;
String plainName;

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Plane [plainId=");
	builder.append(plainId);
	builder.append(", plainName=");
	builder.append(plainName);
	builder.append("]");
	return builder.toString();
}

public int getPlainId() {
	return plainId;
}

public void setPlainId(int plainId) {
	this.plainId = plainId;
}

public String getPlainName() {
	return plainName;
}

public void setPlainName(String plainName) {
	this.plainName = plainName;
}

public static void main(String[] args) {
	Plane p1 = new Plane();
	p1.setPlainId(1010);
	p1.setPlainName("AirIndia");
	
	Plane p2 = new Plane();
	p2.setPlainId(2020);
	p2.setPlainName("Indigo");
	List l =new LinkedList<Plane>();
	l.add(p1);
	l.add(p2);
	System.out.println(l);
	
	ListIterator itr= l.listIterator();
	while (itr.hasNext()) {
		Plane p3 = (Plane) itr.next();
		if (p3.equals(p2)) {
			itr.remove();
			itr.add(p1);
		}
		System.out.println(l);
	}
}
}
