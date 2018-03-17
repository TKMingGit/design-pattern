package com.mingzhao.designpattern.pattern23.p6.simplefactory.practice;

public class ShapeFactory {
	public static Shape getShape(String type){
		Shape shape = null;
		if("Circular".equals(type)){
			shape = new Circular();
		}else if("Rectangle".equals(type)){
			shape = new Rectangle();
		}else if("Triangle".equals(type)){
			shape = new Triangle();
		}
		return shape;
	}
}
