package com.mingzhao.designpattern.principle6.dependencyinversion.before;

public class Test {
	public static void main(String[] args) {
		
		CustomerDAO cd = new CustomerDAO();
		EXCELDataConvertor edc =new EXCELDataConvertor();
		cd.addCustomers(edc);
		
		
		CustomerDAO2 cd2 = new CustomerDAO2();
		TXTDataConvertor tdc = new TXTDataConvertor();
		cd2.addCustomers(tdc);
	}
}
