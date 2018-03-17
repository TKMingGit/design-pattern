package com.mingzhao.designpattern.pattern23.p6.simplefactory.after;

class PieChart implements Chart{
	
	public PieChart() {
		System.out.println("创建饼状图");
	}

	public void display() {
			System.out.println("显示饼状图");
	}
	
}
