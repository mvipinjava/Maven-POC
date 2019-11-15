package com.app;

public class Parent {
public static void m1() {
	System.out.println("parent class");
}
	
}
 class Child extends Parent{
	public static void m1() {
		System.out.println("Child class");
	}
}
 class Test3 {
	 public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		Child c = new Child();
		
	}
 }