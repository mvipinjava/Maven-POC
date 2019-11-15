package com.app.b;

import com.app.c.C;
import com.app.c.CReq;
import com.app.c.CResp;

public class B {

	public BResp m1(BReq breq) {
		
		//get Request from client
		CReq creq = new CReq();
		creq.setOid(breq.getOid());
		creq.setName(breq.getName());
		System.out.println("Enter into B "+breq);
		//prepare creq with help of creq
		C c = new C();
		CResp cresp =c.m1(creq);
		
		// prepare BResp Response with dbresp
		BResp bresp = new BResp();
		bresp.setStatus(cresp.getStatus());
		bresp.setDesc(cresp.getDesc());
		 System.out.println("Exit from B "+ bresp);
		return bresp;
		
		
	}

}
