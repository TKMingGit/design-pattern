package com.mingzhao.designpattern.pattern23.p6.factorymethod.after1;

public class Cilent {
	public static void main(String[] args) {
		LoggerFactory loggerFactory = new DatabaseLoggerFactory();
		Logger logger = loggerFactory.createLogger();
		logger.writeLog();
	}
}
