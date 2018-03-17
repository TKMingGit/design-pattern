package com.mingzhao.designpattern.principle6.liskovsubstitution.before;

public class CommonCustomer {
	public String name;
	public String email;
	public CommonCustomer(String name,String email){
		this.name =name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "CommonCustomer [name=" + name + ", email=" + email + "]";
	}
}
