package com.mingzhao.designpattern.principle6.compositereuse.after;

public class MysqlDBUtil extends DBUtil{
	public void getConnection(){
		System.out.println("获得mysql数据库的链接");
	}
}
