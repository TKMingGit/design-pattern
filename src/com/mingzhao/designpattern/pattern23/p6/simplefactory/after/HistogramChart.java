package com.mingzhao.designpattern.pattern23.p6.simplefactory.after;

class HistogramChart implements Chart{
	
	public HistogramChart() {
		System.out.println("创建柱状图");
	}

	public void display() {
			System.out.println("显示柱状图");
	}
	
}
