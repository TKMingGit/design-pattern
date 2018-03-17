package com.mingzhao.designpattern.principle6.compositereuse.after;

public class Test {
	public static void main(String[] args) {
		MysqlDBUtil mdu = new MysqlDBUtil();
		CustomerDAO cd1 = new CustomerDAO(mdu);
		cd1.addCustomer();
		OracleDBUtil odu = new OracleDBUtil();
		CustomerDAO cd2 = new CustomerDAO(odu);
		cd2.addCustomer();
	}
}
