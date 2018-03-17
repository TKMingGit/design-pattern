package com.mingzhao.designpattern.pattern23.p6.factorymethod.practice;

public class JPGPictureFactory implements PictureFactory{
	public Picture createPicture(){
		System.out.println("jpg工厂返回jpg图片类实体");
		return new JPGPicture();
	}
}
