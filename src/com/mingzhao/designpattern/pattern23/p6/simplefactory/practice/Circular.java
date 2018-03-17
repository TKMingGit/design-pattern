package com.mingzhao.designpattern.pattern23.p6.simplefactory.practice;

public class Circular implements Shape {
	public Circular() {
		System.out.println("初始化圆形类");
	}

	@Override
	public void draw() {
		System.out.println("绘制圆形");
	}

	@Override
	public void erase() {
		System.out.println("擦除圆形");
	}

}
