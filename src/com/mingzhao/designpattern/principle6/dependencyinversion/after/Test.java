package com.mingzhao.designpattern.principle6.dependencyinversion.after;

public class Test {
	public static void main(String[] args) {
		CustomerDAO cd = new CustomerDAO();
		cd.addCustomers(new EXCELDataConvertor());
		cd.addCustomers(new TXTDataConvertor());
	}
}
