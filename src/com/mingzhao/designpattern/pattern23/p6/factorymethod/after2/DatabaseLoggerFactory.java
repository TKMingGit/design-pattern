package com.mingzhao.designpattern.pattern23.p6.factorymethod.after2;

public class DatabaseLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		System.out.println("数据库日志工厂返回数据库日志类");
		return new DatabaseLogger();
	}
}
