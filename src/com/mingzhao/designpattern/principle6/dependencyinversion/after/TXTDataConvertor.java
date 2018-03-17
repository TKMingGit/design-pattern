package com.mingzhao.designpattern.principle6.dependencyinversion.after;

public class TXTDataConvertor extends DataConvertor{
	public void readFile(){
		System.out.println("TXT 读取文件");
	}
}
