package com.app;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
public static void main(String[] args) {
	LinkedHashSet h = new LinkedHashSet();
	h.add("A");
	h.add("B");
	h.add("C");
	h.add("D");
	h.add("D");
	System.out.println(h);
	System.out.println(h.add("D"));
}
}
