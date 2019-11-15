package com.app.c;

public class C {

	public CResp m1(CReq creq) {
		CResp cresp = new CResp();
		cresp.setStatus("Delivered");
		cresp.setDesc("good");
		return cresp;
	}

}
