package com.mingzhao.designpattern.principle6.compositereuse.before;

public class DBUtil {
	public void getConnection(){
		System.out.println("获得mysql数据库的链接");
	}
}
