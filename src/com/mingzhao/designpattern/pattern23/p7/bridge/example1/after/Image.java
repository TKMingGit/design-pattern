package com.mingzhao.designpattern.pattern23.p7.bridge.example1.after;

/**
 * Created by SEELE on 2018/3/12.
 */
public abstract class Image {
    protected Platform platform;

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public abstract void display(String name);
}
