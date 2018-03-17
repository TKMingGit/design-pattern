package com.mingzhao.designpattern.principle6.compositereuse.after;

public class OracleDBUtil extends DBUtil{
	public void getConnection(){
		System.out.println("获得oracle数据库的链接");
	}
}
