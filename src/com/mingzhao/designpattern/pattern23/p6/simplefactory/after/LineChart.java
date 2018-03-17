package com.mingzhao.designpattern.pattern23.p6.simplefactory.after;

class LineChart implements Chart{
	
	public LineChart() {
		System.out.println("创建折线状图");
	}

	public void display() {
			System.out.println("显示折线图");
	}
	
}
