package com.mingzhao.designpattern.principle6.liskovsubstitution.after;

public class CommonCustomer extends Customer{
	public CommonCustomer(String name, String email) {
		super(name,email);
	}
	@Override
	public String toString() {
		return "CommonCustomer [name=" + name + ", email=" + email + "]";
	}
}
