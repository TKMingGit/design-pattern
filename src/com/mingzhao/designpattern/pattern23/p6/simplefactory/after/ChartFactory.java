package com.mingzhao.designpattern.pattern23.p6.simplefactory.after;

public class ChartFactory {
	
	public static Chart getChart(String type){
		Chart chart = null;
		if("histogram".equals(type)){
			chart = new HistogramChart();
			System.out.println("工厂类初始化设置柱状图！");
		}else if("line".equals(type)){
			chart = new LineChart();
			System.out.println("工厂类初始化设置折线图！");
		}else if("pie".equals(type)){
			chart = new PieChart();
			System.out.println("工厂类初始化设置饼状图！");
		}
		return chart;
	}
}
