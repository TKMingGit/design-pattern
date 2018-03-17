package com.mingzhao.designpattern.pattern23.p7.decorator.before;

/**
 * Created by SEELE on 2018/3/14.
 */
public class ScrollBarListBox extends Window {
    @Override
    public void display() {
        set();
        System.out.println("具有滚动条的下拉框");
    }

    public void set(){
        System.out.println("设置滚动条");
    }
}
