package com.mingzhao.designpattern.pattern23.p6.simplefactory.practice;

public class Triangle implements Shape {

	public Triangle() {
		System.out.println("初始化三角形类");
	}

	@Override
	public void draw() {
		System.out.println("绘制三角形");
	}

	@Override
	public void erase() {
		System.out.println("擦除三角形");
	}
}
