package com.app.byke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) throws JsonProcessingException {

		Address addr1 = new Address();
		addr1.setCity("bhandara");
		addr1.setLandMark("petrol pump");
		addr1.setPincode(441906);
		addr1.setStreet("vivekanand col");
		addr1.setState("Ms");
		
		Address addr2 = new Address();
		addr2.setCity("thana");
		addr2.setLandMark("jawahar nagar");
		addr2.setPincode(441904);
		addr2.setStreet("sawari");
		addr2.setState("Ms");
		
		
		Bank bank1 = new Bank();
		bank1.setBankName("sbi");
		bank1.setBankCode(2156);
		bank1.setBankIfsc("sbi123");
		bank1.setBankAddr(addr1);
		
		
		Bank bank2 = new Bank();
		bank2.setBankName("hdfc");
		bank2.setBankCode(5156);
		bank2.setBankIfsc("hdfc123");
		bank2.setBankAddr(addr2);
		
		
		
		CustomerDetails cd = new CustomerDetails();
		cd.setCustName("vipin");
		List<Bank> lst=new ArrayList<Bank>();
		cd.setBankDetails(lst);
//	try {
		ObjectMapper mapper= new ObjectMapper();
		String json =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cd);
		System.out.println(json);
//	} catch ( e) {
	
//	}
	}
}
