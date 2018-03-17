package com.mingzhao.designpattern.pattern23.p7.bridge.example1.after;

import java.util.Random;

/**
 * Created by SEELE on 2018/3/12.
 */
public class Client {
    static Image images[] = new Image[]{new BMPImage(),new JPGImage(),new PNGImage(),new GIFImage()};
    static Platform platforms[] = new Platform[]{new Windows(),new Linux(),new Unix()};

    public static void main(String[] args){
        Random rand = new Random();
        Image image = images[rand.nextInt(100) % 4];
        Platform platform = platforms[rand.nextInt(100) % 3];
        image.setPlatform(platform);
        image.display("张三");
    }

}
