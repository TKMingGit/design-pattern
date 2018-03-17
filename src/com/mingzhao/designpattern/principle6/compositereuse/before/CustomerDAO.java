package com.mingzhao.designpattern.principle6.compositereuse.before;
//不同的数据库需要继承不同的数据库链接工具类，违反开闭原则
public class CustomerDAO /*extends DBUtil*/ extends OracleDBUtil{
	public void addCustomer(){
		super.getConnection();
		System.out.println("添加用户");;
	}
}
