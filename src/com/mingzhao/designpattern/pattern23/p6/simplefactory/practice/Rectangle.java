package com.mingzhao.designpattern.pattern23.p6.simplefactory.practice;

public class Rectangle implements Shape {

	public Rectangle() {
		System.out.println("初始化长方形类");
	}

	@Override
	public void draw() {
		System.out.println("绘制长方形");
	}

	@Override
	public void erase() {
		System.out.println("擦除长方形");
	}

}
