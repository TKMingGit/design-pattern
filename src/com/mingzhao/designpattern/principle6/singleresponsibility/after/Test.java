package com.mingzhao.designpattern.principle6.singleresponsibility.after;

public class Test {
	public static void main(String[] args) {
		SrpAfter sa =new SrpAfter();
		sa.getSad().getSadu().getConnection();
		sa.getSad().findCustomers();
		sa.createChart();
		sa.displayChart();
	}
}
