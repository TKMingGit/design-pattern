package com.mingzhao.designpattern.principle6.compositereuse.before;

public class Test {
	public static void main(String[] args) {
		CustomerDAO cd = new CustomerDAO();
		cd.addCustomer();
	}
}
