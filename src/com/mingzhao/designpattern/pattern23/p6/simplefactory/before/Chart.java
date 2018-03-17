package com.mingzhao.designpattern.pattern23.p6.simplefactory.before;

class Chart {
	private String type; // 图表类型

	public Chart(Object[][] data, String type) {
		this.setType(type);
		if (type.equalsIgnoreCase("histogram")) {
			System.out.println("初始化柱状图");
		} else if (type.equalsIgnoreCase("pie")) {
			System.out.println("初始化饼状图");
		} else if (type.equalsIgnoreCase("line")) {
			System.out.println("初始化折线图");
		}
	}

	public void display() {
		if (this.getType().equalsIgnoreCase("histogram")) {
			System.out.println("显示柱状图");
		} else if (this.getType().equalsIgnoreCase("pie")) {
			System.out.println("显示饼状图");
		} else if (this.getType().equalsIgnoreCase("line")) {
			System.out.println("显示折线图");
		}
	}
	
	public String display2() {
		if (this.getType().equalsIgnoreCase("histogram")) {
			return "显示柱状图";
		} else if (this.getType().equalsIgnoreCase("pie")) {
			return "显示饼状图";
		} else if (this.getType().equalsIgnoreCase("line")) {
			return "显示折线图";
		}
		return null;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
