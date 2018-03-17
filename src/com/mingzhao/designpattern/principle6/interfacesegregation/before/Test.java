package com.mingzhao.designpattern.principle6.interfacesegregation.before;

public class Test {
	public static void main(String[] args) {
		Client c = new Client();
		c.handleData(new ConcreteClass());
	}
}
