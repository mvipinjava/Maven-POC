package com.app;

public class PopCorn {
public void taste() {
	System.out.println("spicy");
}
}

class Test2{
	public static void main(String[] args) {
		PopCorn p = new PopCorn()
		{
		public void taste() {
			System.out.println("SALTYS");
		}	
		};
	p.taste();
	PopCorn p1 = new PopCorn();
	p1.taste();
	}}
