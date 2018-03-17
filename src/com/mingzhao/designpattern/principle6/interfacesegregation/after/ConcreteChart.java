package com.mingzhao.designpattern.principle6.interfacesegregation.after;

public class ConcreteChart implements ChartHandler, DataHandler {

	@Override
	public void dataRead() {
		System.out.println("读取数据");
	}

	@Override
	public void createChart() {
		System.out.println("创建图表");
	}

	@Override
	public void displayChart() {
		System.out.println("展示图表");
	}

}
