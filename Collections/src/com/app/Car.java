package com.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Car {
	int carId;
	String carName;
	
@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [carId=");
		builder.append(carId);
		builder.append(", carName=");
		builder.append(carName);
		builder.append("]");
		return builder.toString();
	}

public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

public static void main(String[] args) {
	Car c1 = new Car();
	c1.setCarId(101);
	c1.setCarName("Maruti");
	
	Car c2 = new Car();
	c2.setCarId(102);
	c2.setCarName("Baleno");
	
ArrayList<Car> l = new ArrayList<Car>();
	l.add(c1);
	l.add(c2);
	
	LinkedList l1 = new LinkedList(l);
	System.out.println(l1);
	l1.set(0, c2);
	System.out.println(l1);
	System.out.println(l1 instanceof Serializable);
	
}
}
