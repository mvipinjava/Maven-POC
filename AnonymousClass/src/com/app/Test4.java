package com.app;

public class Test4 {
static class Nested{
	public void m1() {
		System.out.println("nested class method");
	}
}
public static void main(String[] args) {
	Test4.Nested t = new Test4.Nested();
	t.m1();
}
}
