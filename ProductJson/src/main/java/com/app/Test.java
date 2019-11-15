package com.app;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
public static void main(String[] args) {
	//Margin object
	Margin margin1 = new Margin();
	margin1.setMrgId(65);
	margin1.setMrgCode("H1-A");
	
	//Margin object 2
	Margin margin2 = new Margin();
	margin2.setMrgId(75);
	margin2.setMrgCode("H1-B");
	
	//Margin object 3
	Margin margin3 = new Margin();
	margin3.setMrgId(85);
	margin3.setMrgCode("H1-C");
	
	
	//Margin object 4
	Margin margin4 = new Margin();
	margin1.setMrgId(95);
	margin1.setMrgCode("H1-D");
	
	//Model object 1
	Model model1= new Model();
	model1.setModId(1111);
	model1.setModCode("HP");
	model1.setModCOst(28000.00);
	Map<Integer, Margin> map1= new LinkedHashMap<Integer, Margin>();
	map1.put(10, margin1);
	map1.put(20,margin2);
	model1.setMarginObjs(map1);
	//Model object 2
	Model model2= new Model();
	model2.setModId(2222);
	model2.setModCode("Dell");
	model2.setModCOst(38000.00);
	Map<Integer, Margin> map2= new LinkedHashMap<Integer, Margin>();
	map2.put(10, margin3);
	map2.put(20,margin4);
	model2.setMarginObjs(map2);
	
	
	//product Object
	
	Product p = new Product();
	p.setProdId(888);
	p.setProdName("Laptop");
	List<Model> lst = new ArrayList<Model>();
	lst.add(model1);
	lst.add(model2);
	p.setModelObjs(lst);
	
	
	//object mapper
	try {
		ObjectMapper mapper = new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p);
		System.out.println(json);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	
	
	
	
	
}
}
