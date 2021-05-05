package com.sreenutech.projectxclient;

import com.sreenutech.projectx.X;
import com.sreenutech.projectx.model.XReq;
import com.sreenutech.projectx.model.XResp;
import com.sreenutech.projecty.Y;
import com.sreenutech.projecty.model.YReq;
import com.sreenutech.projecty.model.YResp;

public class XClient {

	public static void main(String[] args) {

		X x = new X();

		// prepare xreq
		XReq xreq = new XReq();
		xreq.setOid("123");
		xreq.setName("mobile");
		xreq.setDesc("Good");

		XResp xresp = x.m1(xreq);

		System.out.println("Response is :" + xresp.getStatus());

	}

}
