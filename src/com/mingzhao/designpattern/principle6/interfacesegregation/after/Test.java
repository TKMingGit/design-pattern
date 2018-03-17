package com.mingzhao.designpattern.principle6.interfacesegregation.after;

public class Test {
	public static void main(String[] args) {
		Client c = new Client();
		c.handleChart(new ConcreteChart());
		c.handleReport(new ConcreteReport());
	}
}
