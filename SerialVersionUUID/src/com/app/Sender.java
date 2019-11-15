package com.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {
public static void main(String[] args) throws IOException {
	Dog d1 = new Dog();
	FileOutputStream fos = new FileOutputStream("D:\\abcd.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);
}
}
