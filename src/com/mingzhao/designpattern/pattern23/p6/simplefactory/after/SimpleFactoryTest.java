package com.mingzhao.designpattern.pattern23.p6.simplefactory.after;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mingzhao.designpattern.util.XMLUtil;

public class SimpleFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		//通過配置文件工具類，這樣不用每次修改客戶端
		String type = XMLUtil.getType();
		Chart chart;
		chart = ChartFactory.getChart(type);
		assertEquals("PieChart", chart.getClass().getName());
		chart.display();
	}

}
