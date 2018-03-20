package com.mingzhao.designpattern.pattern23.p6.simplefactory.before;

public class ChartTest {

	public static void main(String[] args){
		Chart chart = new Chart(null, "histogram");
		chart.display();
		chart.display2();

		chart = new Chart(null, "pie");
		chart.display();
		chart.display2();
	}
}
