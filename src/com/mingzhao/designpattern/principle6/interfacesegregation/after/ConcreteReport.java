package com.mingzhao.designpattern.principle6.interfacesegregation.after;

public class ConcreteReport implements DataHandler, ReportHandler {

	@Override
	public void dataRead() {
		System.out.println("读取数据");
	}
	@Override
	public void createReport() {
		System.out.println("创建报告");
	}

	@Override
	public void displayReport() {
		System.out.println("展示报告");
	}

}
