package com.app;

import java.util.Hashtable;

public class HashTableDemo {
public static void main(String[] args) {
	Hashtable ht = new Hashtable();
	ht.put("bc", "abc");
	ht.put(101, "abc");
	ht.put("abc", 103);
	System.out.println(ht);
}
}
