package com.mingzhao.designpattern.pattern23.p6.factorymethod.after1;

public class FileLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		System.out.println("文件日志工厂返回文件日志类");
		return new FileLogger();
	}
}
