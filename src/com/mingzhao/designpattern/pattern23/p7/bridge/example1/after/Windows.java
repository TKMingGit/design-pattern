package com.mingzhao.designpattern.pattern23.p7.bridge.example1.after;

/**
 * Created by SEELE on 2018/3/12.
 */
public class Windows implements Platform {
    @Override
    public void chosePlatform(String name) {
        System.out.println("windows platform: " + name);
    }
}
