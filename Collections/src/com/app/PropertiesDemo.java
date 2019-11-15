package com.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) throws IOException {
	Properties p = new Properties();
	FileInputStream fis = new FileInputStream("D:\\abc.txt");
	p.load(fis);
	System.out.println(p);
	p.setProperty("abc", "256");
	FileOutputStream fos = new FileOutputStream("D:\\abc.txt");
	p.store(fos, "ipdated values");
	
}
}
