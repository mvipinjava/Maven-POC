package com.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("D:\\abcd.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2=(Dog) ois.readObject();
	System.out.println(d2.i+"....."+d2.j);
}
}
