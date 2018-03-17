package com.mingzhao.designpattern.principle6.liskovsubstitution.after;

public class VIPCustomer extends Customer{
	
	public VIPCustomer(String name, String email) {
		super(name,email);
	}
	@Override
	public String toString() {
		return "VIPCustomer [name=" + name + ", email=" + email + "]";
	}
}
