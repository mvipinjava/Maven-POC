package com.app;

class Test4{
	public static void main(String[] args) {
		PopCorn1 p = new PopCorn1() {
			public void taste()
			{
				m1();
				System.out.println("saltys");
			}
			public void m1() 
			{
				System.out.println("child specific method");
			}
		};
		p.taste();
		PopCorn1 p1= new PopCorn1();
		p1.taste();
	}
}

