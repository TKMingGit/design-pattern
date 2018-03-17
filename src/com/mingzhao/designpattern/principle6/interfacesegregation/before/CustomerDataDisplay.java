package com.mingzhao.designpattern.principle6.interfacesegregation.before;

public interface CustomerDataDisplay {
	public void dataRead();
	public void transformToXML();
	public void createChart();
	public void displayChart();
	public void createReport();
	public void displayReport();
}
