package com.mingzhao.designpattern.principle6.compositereuse.after;

public class CustomerDAO {
	public DBUtil util ;
	public CustomerDAO(DBUtil util) {
		this.util =util;
	}
	public void addCustomer(){
		util.getConnection();
		System.out.println("添加用户");;
	}
}
