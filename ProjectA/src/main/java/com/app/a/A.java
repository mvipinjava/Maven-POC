package com.app.a;

import com.app.b.B;
import com.app.b.BReq;
import com.app.b.BResp;

public class A {
public AResp m1(AReq areq) {
	//Get request from client
	BReq breq = new BReq();
	breq.setOid(areq.getOid());
	breq.setName(areq.getName());
	
	System.out.println("Enter into A "+areq);
	
	//call b and get bresp
	B b = new B();
	 BResp bresp=b.m1(breq);
	
	 
	 // prepare Aresp
	 AResp aresp = new AResp();
	 aresp.setStatus(bresp.getStatus());
	 aresp.setDesc(bresp.getDesc());
	 System.out.println("Exit from A "+aresp);
	return aresp;}
}
