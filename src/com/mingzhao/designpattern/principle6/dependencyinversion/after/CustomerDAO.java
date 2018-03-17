package com.mingzhao.designpattern.principle6.dependencyinversion.after;


public class CustomerDAO {
	Class<?> t = null;
	CustomerDAO(){
		try {
			System.err.println(Config.NAME);
			t = Class.forName(Config.NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void addCustomers(DataConvertor dc){
		dc.readFile();
		System.out.println("保存用户信息");
	}
	public Class<?> getT() {
		return t;
	}
	public void setT(Class<?> t) {
		this.t = t;
	}
}
