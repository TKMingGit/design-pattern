package com.mingzhao.designpattern.principle6.singleresponsibility.before;

public class SrpBefore {
	public static void main(String[] args) {
		SrpBefore sprB = new SrpBefore();
		sprB.getConnection();
		sprB.findCustomers();
		sprB.createChart();
		sprB.displayChart();
	}
	
	public void getConnection(){
		System.out.println("获得数据库连接...");
	}
	public void findCustomers(){
		System.out.println("查找用户...");
	}
	public void createChart(){
		System.out.println("创建图表...");
	}
	public void displayChart(){
		System.out.println("展示图表...");
	}
	
}
