package com.mingzhao.designpattern.principle6.interfacesegregation.after;

public class Client {
	public void handleChart(ConcreteChart cc ) {
		cc.dataRead();
		cc.createChart();
		cc.displayChart();
	}
	public void handleReport(ConcreteReport cr ) {
		cr.dataRead();
		cr.createReport();
		cr.displayReport();
	}
}
