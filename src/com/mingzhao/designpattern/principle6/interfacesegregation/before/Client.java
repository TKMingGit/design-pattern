package com.mingzhao.designpattern.principle6.interfacesegregation.before;

public class Client {
	public void handleData(CustomerDataDisplay cdd ) {
		cdd.dataRead();
		cdd.transformToXML();
		cdd.createChart();
		cdd.displayChart();
		cdd.createReport();
		cdd.displayReport();
	}
}
