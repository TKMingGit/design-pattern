package com.mingzhao.designpattern.pattern23.p6.factorymethod.practice;

public class GIFPictureFactory {
	public Picture createPicture(){
		System.out.println("gif工厂返回gif图片类实体");
		return new GIFPicture();
	}
}
