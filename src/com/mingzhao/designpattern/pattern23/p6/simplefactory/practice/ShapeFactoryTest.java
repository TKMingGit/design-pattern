package com.mingzhao.designpattern.pattern23.p6.simplefactory.practice;

import com.mingzhao.designpattern.util.XMLUtil;

public class ShapeFactoryTest {
	public static void main(String[] args) {
		//配置文件配置没有的类名
		String type = XMLUtil.getType();
		Shape shape = ShapeFactory.getShape(type);
		if(shape == null ){
			System.out.println("UnSupportedShapeException");
		}
	}

}
