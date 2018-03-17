package com.mingzhao.designpattern.pattern23.p6.simplefactory.before;

public class Test {
	public static void main(String[] args) {
		Chart chart1 = new Chart(null, "histogram");
		chart1.display();
		
		Chart chart2 = new Chart(null, "pie");
		chart2.display();
		
		Chart chart3 = new Chart(null, "line");
		chart3.display();
	}
}
