package com.app.client;

import com.app.a.A;
import com.app.a.AReq;
import com.app.a.AResp;

public class AClient {
public static void main(String[] args) {
	
	A a = new A();
	AReq areq = new AReq();
	areq.setOid("101");
	areq.setName("vipin");
	
	AResp aresp = a.m1(areq);
	System.out.println(aresp);
	
	}
}

