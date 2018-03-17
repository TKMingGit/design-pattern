package com.mingzhao.designpattern.pattern23.p6.factorymethod.before;

public class Cilent {
	public static void main(String[] args) {
		String type = "DatabaseLogger";
		Logger logger = LoggerFactory.getLogger(type);
		logger.writeLog();
	}
}
