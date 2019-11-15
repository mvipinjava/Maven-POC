package com.app;

import java.io.*;

public class Account implements Serializable{
	//private static final long serialVersionUID=1L;
	String un = "vipin";
	transient String pwd="mahor";
	
	private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
private  void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
	ois.defaultReadObject();
	String epwd=(String) ois.readObject();
	pwd=epwd.substring(3);
}
}
