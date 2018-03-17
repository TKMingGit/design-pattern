package com.mingzhao.designpattern.principle6.dependencyinversion.before;

public class CustomerDAO {
	public void addCustomers(EXCELDataConvertor edc){
		edc.readFile();
		System.out.println("保存用户信息");
	}
}
