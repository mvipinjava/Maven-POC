package com.app;

public class Outer1 {
int x = 10;
class Inner{
	int x = 20;
	public void m1(){
		int x= 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(Outer1.this.x);
	}
}
public static void main(String[] args) {
	Outer1 o = new Outer1();
	o.new Inner().m1();
	
}
}
