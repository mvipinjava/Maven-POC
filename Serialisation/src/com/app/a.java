package com.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class CustomSerialDemo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a1 = new Account();
		System.out.println(a1.un+"..."+a1.pwd);
		FileOutputStream fos = new FileOutputStream("D:/abcdefg.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(a1);
		System.out.println(a1.un+"..."+a1.pwd);
		FileInputStream fis = new FileInputStream("D:/abcdefg.ser");
		ObjectInputStream oos1 = new ObjectInputStream(fis);
		Account a2=(Account) oos1.readObject();
	System.out.println(a2.un+"..."+a2.pwd);
		
		
	
}}
