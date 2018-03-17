package com.mingzhao.designpattern.pattern23.p6.factorymethod.after2;

import com.mingzhao.designpattern.util.XMLUtil;

public class Cilent {
	/***
	 *  Java反射(Java Reflection)是指在程序运行时获取已知名称的类或已有对象的相关信息的一种机
	 *  制，包括类的方法、属性、父类等信息，还包括实例的创建和实例类型的判断等。在反射中
	 *	使用最多的类是Class，Class类的实例表示正在运行的Java应用程序中的类和接口，其
	 *	forName(String className)方法可以返回与带有给定字符串名的类或接口相关联的 Class对象，
	 *	再通过Class对象的newInstance()方法创建此对象所表示的类的一个新实例，即通过一个类名字
	 *	符串得到类的实例
	 * @param args
	 */
	public static void main(String[] args) {
		LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getBean("resource/config-method-factory.xml", "className");
		Logger logger = loggerFactory.createLogger();
		logger.writeLog();
	}
}
