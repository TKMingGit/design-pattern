package com.mingzhao.designpattern.pattern23.p6.simplefactory.after;

import com.mingzhao.designpattern.util.XMLUtil;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		//通過配置文件工具類，這樣不用每次修改客戶端
		String type = XMLUtil.getType();
		Chart chart;
		chart = ChartFactory.getChart(type);
		chart.display();
	}

}
