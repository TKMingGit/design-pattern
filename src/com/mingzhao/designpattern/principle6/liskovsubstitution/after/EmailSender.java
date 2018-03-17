package com.mingzhao.designpattern.principle6.liskovsubstitution.after;

public class EmailSender {
	public void send(Customer cus){
		System.out.println("send to cus:"+cus.toString());
	}
}
