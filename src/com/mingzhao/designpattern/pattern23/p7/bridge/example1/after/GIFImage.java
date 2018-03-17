package com.mingzhao.designpattern.pattern23.p7.bridge.example1.after;

/**
 * Created by SEELE on 2018/3/12.
 */
public class GIFImage extends Image {

    @Override
    public void display(String name) {
        platform.chosePlatform(name + ".gif");
    }
}
