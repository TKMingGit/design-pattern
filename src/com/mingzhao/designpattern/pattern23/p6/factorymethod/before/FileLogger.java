package com.mingzhao.designpattern.pattern23.p6.factorymethod.before;

public class FileLogger implements Logger{
	public void writeLog(){
		System.out.println("文件日志类写日志");
	}
}
