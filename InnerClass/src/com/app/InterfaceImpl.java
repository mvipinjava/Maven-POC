package com.app;

public class InterfaceImpl implements OuterInterface.InnerInterface{

	@Override
	public void m3() {
		System.out.println("m2- method from Inner Interface");
		
	}
	public static void main(String[] args) {
		InterfaceImpl i = new InterfaceImpl();
		i.m3();
	}

	

}
