package com.app;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorClass {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add("A");
	t.add("B");
	t.add("C");
	t.add("D");
	System.out.println(t);
	TreeSet t1 = new TreeSet();
	t1.add("F");
	t1.add("E");
	t1.add("H");
	t1.add("A");
	System.out.println(t1);
}
}
public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		 String s1=o1.toString();
		 String s2=(String) o2;
		 
	}
}
