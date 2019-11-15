package com.app;

public class Class4 implements Interface3{

	@Override
	public void m1() {
		System.out.println("m1-method");
		
	}

	public static void main(String[] args) {
		Class4 c = new Class4();
		c.m1();
	}

}
