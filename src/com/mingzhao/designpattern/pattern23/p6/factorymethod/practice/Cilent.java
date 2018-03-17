package com.mingzhao.designpattern.pattern23.p6.factorymethod.practice;

public class Cilent {
	public static void main(String[] args) {
		PictureFactory picFatory = new JPGPictureFactory();
		Picture picture = picFatory.createPicture();
		picture.read();
		
	}
}
