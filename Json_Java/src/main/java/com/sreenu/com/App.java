package com.sreenu.com;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
public static void main(String[] args) throws JsonProcessingException {
	Student s = new Student();
	s.setStdId(101);
	s.setsName("abc");
	s.setScourse("java");
	System.out.println("The Student object in java is:"+s);
	System.out.println("java to json");
	ObjectMapper mapper = new ObjectMapper();
	String jsonObject=mapper.writeValueAsString(s);
	System.out.println(jsonObject);
	
	System.out.println("==================================");
	
	System.out.println("Json To Java Object");
	ObjectMapper mapper1= new ObjectMapper();
	Student javaObject=mapper1.readValue(jsonObject, Student.class);
	System.out.println("The Student Java Object is"+javaObject);
	
}
}
