package com.app;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalDemo  implements Externalizable{
	
String un;
String roll;

	public ExternalDemo() {
	super();
	System.out.println("no-args const");
}
	

	public ExternalDemo(String un, String roll) {
		super();
		this.un = un;
		this.roll = roll;
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		un=(String) in.readObject();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(un);
	}
	

}
 class ExtDemo{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExternalDemo ed = new ExternalDemo("vipin","123");
		FileOutputStream fos = new FileOutputStream("D:/abcdefgh.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ed);
		System.out.println(ed.un+"..."+ed.roll);
		FileInputStream fis = new FileInputStream("D:/abcdefgh.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalDemo ed2=(ExternalDemo) ois.readObject();
		System.out.println(ed2.un+"...."+ed2.roll);
}
}