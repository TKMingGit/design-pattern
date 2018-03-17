package com.mingzhao.designpattern.principle6.singleresponsibility.after;

public class SrpAfter {
	private SrpAfterDao sad =new SrpAfterDao();
	public void createChart(){
		System.out.println("创建图表...");
	}
	public void displayChart(){
		System.out.println("展示图表...");
	}

	public SrpAfterDao getSad() {
		return sad;
	}

	public void setSad(SrpAfterDao sad) {
		this.sad = sad;
	}
	
}
