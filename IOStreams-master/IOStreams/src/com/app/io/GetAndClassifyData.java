package com.app.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.app.beans.Customer;

public class GetAndClassifyData {

	
	public static void main(String[] args) throws IOException {

		Map<String,Map<Integer,List<Customer>>> map=new HashMap();
		
		File file = new File("src/data.txt"); 
		Map<Integer,List<Customer>> visaMap=new HashMap<>();
		Map<Integer,List<Customer>> amexMap=new HashMap<>();
		Map<Integer,List<Customer>> masterMap=new HashMap<>();
		Map<Integer,List<Customer>> othersMap=new HashMap<>();
		
		List<Customer> visa=new ArrayList<Customer>();
		List<Customer> master=new ArrayList<Customer>();
		List<Customer> amex=new ArrayList<Customer>();
		List<Customer> others=new ArrayList<Customer>();
	
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st;
		  int i=0,j=0,k=0,l=0;
		  
		  //skip first line of heading
		  st=br.readLine();
		 //read remaining file
		  
		  while ((st = br.readLine()) != null) {
			  
			  Customer cust=getObject(st);
			  
			  if(cust.getCradNumber().charAt(0)=='3') {
			       amex.add(cust);
			       i++;
			      
			  }
			  else if(cust.getCradNumber().charAt(0)=='5') {
				  visa.add(cust);
				  j++;
				  
			  }
			  else if(cust.getCradNumber().charAt(0)=='6') {
				  master.add(cust);
                  k++;
			  }
			  else {
				  others.add(cust);
				  l++;
			  }
		  } //while
		
		

		  
		//adding no of customers per every card and updating that number
			
		  amexMap.put(i, amex);
		  masterMap.put(k, master);
		  visaMap.put(j, visa);
		  othersMap.put(l, others);
		
		//adding final result to map  
		map.put("amex", amexMap);
		map.put("visa", visaMap);
		map.put("master", masterMap);
		map.put("others", othersMap);
		
		//System.out.println(map);
		Iterator itr=map.entrySet().iterator();
		
		  while(itr.hasNext()) {
			  Map.Entry mapElement= (Entry) itr.next();
			  
			  System.out.println(mapElement.getKey()+" ---> "+mapElement.getValue());
		 
		  }
		  
	}//main()

	private static Customer getObject(String st) {
		
		String words[]=st.split(" ");
		Customer cust=new Customer();
		
		cust.setCustId(words[0]);
		cust.setCustName(words[1]);
		cust.setCradNumber(words[2]);
		cust.setDob(words[3]);
		cust.setBalance(words[4]);
		cust.setEmailId(words[5]);
		
		
		return cust;
	}
}//class
