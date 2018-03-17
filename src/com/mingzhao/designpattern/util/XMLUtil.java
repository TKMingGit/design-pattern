package com.mingzhao.designpattern.util;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
	// 该方法用于从XML配置文件中提取图表类型，并返回类型名
	public static String getType() {
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("resource/config-simple-factory.xml"));
			// 获取包含图表类型的文本节点
			NodeList nl = doc.getElementsByTagName("chartType");
			Node classNode = nl.item(0).getFirstChild();
			String chartType = classNode.getNodeValue().trim();
			return chartType;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getType(String filePath,String tagName) {
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File(filePath));
			// 获取包含图表类型的文本节点
			NodeList nl = doc.getElementsByTagName(tagName);
			Node classNode = nl.item(0).getFirstChild();
			String chartType = classNode.getNodeValue().trim();
			return chartType;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Object getBean(String filePath,String tagName) {
		String type = getType(filePath, tagName);
		Object obj = null ;
		try {
			Class<?> c = Class.forName(type);
			obj = c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return obj;
	}
}