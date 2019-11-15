package com.app;

public class Outer {
int x = 10;
static int y =30;
	public  void m1() {
		 int z = 40;
		class Inner{
			public void m2() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
			
		}
		Inner i = new Inner();
		i.m2();
		
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m1();
	}

}
