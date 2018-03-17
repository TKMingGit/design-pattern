package com.mingzhao.designpattern.pattern23.p7.decorator.before;

/**
 * Created by SEELE on 2018/3/14.
 */
public class BlackBorderTextBox extends Window {
    @Override
    public void display() {
        set();
        System.out.println("具有黑边框的文本框");
    }

    public void set(){
        System.out.println("设置黑边框");
    }
}