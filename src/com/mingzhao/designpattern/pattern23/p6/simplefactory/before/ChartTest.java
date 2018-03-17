package com.mingzhao.designpattern.pattern23.p6.simplefactory.before;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ChartTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testChart() {
		Chart chart = new Chart(null, "histogram");
		assertEquals("histogram", chart.getType());
	}

	@Test
	public void testDisplay() {
		Chart chart = new Chart(null, "pie");
		chart.display();
		assertEquals("显示饼状图", chart.display2());
		assertNotNull(chart);
	}

}
