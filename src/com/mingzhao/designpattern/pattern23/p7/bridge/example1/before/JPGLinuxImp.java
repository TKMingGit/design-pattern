package com.mingzhao.designpattern.pattern23.p7.bridge.example1.before;

/**
 * Created by SEELE on 2018/3/12.
 */
public class JPGLinuxImp extends JPGImage {
    public void platform() {
        System.out.println("linux show: ");
        super.font();
    }
}
