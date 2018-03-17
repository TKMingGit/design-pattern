package com.mingzhao.designpattern.pattern23.p7.decorator.before;

/**
 * Created by SEELE on 2018/3/14.
 */
public class Window implements Component {
    @Override
    public void display() {
        System.out.println("窗体");
    }
}
