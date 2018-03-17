package com.mingzhao.designpattern.principle6.singleresponsibility.after;

public class SrpAfterDao {
	private SrpAfterDbUtils sadu = new SrpAfterDbUtils();
	public void findCustomers(){
		System.out.println("查找用户...");
	}
	public SrpAfterDbUtils getSadu() {
		return sadu;
	}
	public void setSadu(SrpAfterDbUtils sadu) {
		this.sadu = sadu;
	}
}
