package com.app;

public class Clone implements Cloneable{
int i = 10;
int j= 20;

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Clone [i=");
	builder.append(i);
	builder.append(", j=");
	builder.append(j);
	builder.append("]");
	return builder.toString();
}

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}

public int getJ() {
	return j;
}

public void setJ(int j) {
	this.j = j;
}

public static void main(String[] args) throws CloneNotSupportedException {
	Clone c1 = new Clone();
	Clone c2=(Clone) c1.clone();
	System.out.println(c1.hashCode());
	System.out.println(c1.j);
	System.out.println(c2.hashCode());
	System.out.println(c2.j);
	
	
}
}
