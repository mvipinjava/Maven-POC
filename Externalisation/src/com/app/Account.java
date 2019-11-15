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

public class Account implements Externalizable{
	private int acctId;
	private String accHolderName;
	private Double accBalance;
	

	public Account() {
		super();
	}

	public Account(int acctId, String accHolderName, Double accBalance) {
		super();
		this.acctId = acctId;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		accBalance=(Double) in.readObject();
		acctId=in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(acctId);
		out.writeObject(accBalance);
	}

}
 class CustomiseExt{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a = new Account(101,"vipin", 5.5);
		FileOutputStream fos = new FileOutputStream("D:/acct.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		System.out.println(a);
		FileInputStream fis = new FileInputStream("D:/acct.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2=(Account) ois.readObject();
		System.out.println(a2);
		
	}
}
