package com.mingzhao.designpattern.pattern23.p6.factorymethod.before;

public class LoggerFactory {
	public static Logger getLogger(String type){
		Logger logger = null;
		if("DatabaseLogger".equals(type)){
			logger = new DatabaseLogger();
			System.out.println("初始化数据库日志类");
		}else if("FileLogger".equals(type)){
			logger = new DatabaseLogger();
			System.out.println("初始化文件日志类");
		}
		return logger;	
	}
}
