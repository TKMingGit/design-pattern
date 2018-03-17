package com.mingzhao.designpattern.pattern23.p6.factorymethod.after2;

public class DatabaseLogger implements Logger{
	public void writeLog(){
		System.out.println("数据库日志类写日志");
	}
}
