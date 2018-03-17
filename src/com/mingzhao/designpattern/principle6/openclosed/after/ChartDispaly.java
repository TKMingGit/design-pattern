package com.mingzhao.designpattern.principle6.openclosed.after;

public class ChartDispaly {
	public AbstractDisplay ad ;
	
	public static void main(String[] args) {
		ChartDispaly chart = new ChartDispaly();
		BarChart bar = new BarChart();
		chart.setAd(bar);
		chart.display();
		PieChart pie = new PieChart();
		chart.setAd(pie);
		chart.display();
		LineChart line = new LineChart();
		chart.setAd(line);
		chart.display();
	}
	
	protected void display(){
		ad.display();
	}
	public AbstractDisplay getAd() {
		return ad;
	}

	public void setAd(AbstractDisplay ad) {
		this.ad = ad;
	}

}
