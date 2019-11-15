package com.app;
public class Vehicle{
	public class Car{
		public class Enginee{
			public void carEnginee(){
				System.out.println("Engine is repaired");
			}
		}
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Vehicle.Car c = v.new Car();
		Vehicle.Car.Enginee e = c.new Enginee();
		e.carEnginee();
				
	}
}