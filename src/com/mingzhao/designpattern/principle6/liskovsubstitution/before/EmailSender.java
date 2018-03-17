package com.mingzhao.designpattern.principle6.liskovsubstitution.before;

public class EmailSender {
	public void send(CommonCustomer cc){
		System.out.println("send to cc:"+cc.toString());
	}
	public void send(VIPCustomer vc){
		System.out.println("send to vc:"+vc.toString());
	}
}
