package com.mingzhao.designpattern.principle6.openclosed.before;

public class ChartDispaly {
	public static void main(String[] args) {
		ChartDispaly chart = new ChartDispaly();
		chart.display("pie");
		chart.display("bar");
	}
	protected void display(String type){
		if("pie".equals(type)){
			PieChart pie = new PieChart();
			pie.display();
		}else if("bar".equals(type)){
			BarChart bar = new BarChart();
			bar.display();
		}
	}
}
