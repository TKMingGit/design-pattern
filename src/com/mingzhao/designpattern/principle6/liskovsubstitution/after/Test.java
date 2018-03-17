package com.mingzhao.designpattern.principle6.liskovsubstitution.after;

public class Test {
	public static void main(String[] args) {
		CommonCustomer cc = new CommonCustomer("cc", "cc@outlook.com");
		VIPCustomer vc = new VIPCustomer("vc", "vc@outlook.com");
		EmailSender es = new EmailSender();
		es.send(cc);
		es.send(vc);
	}
}
