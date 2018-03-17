package com.mingzhao.designpattern.principle6.dependencyinversion.before;

public class CustomerDAO2 {
	public void addCustomers(TXTDataConvertor tdc){
		tdc.readFile();
		System.out.println("保存用户信息");
	}
}
