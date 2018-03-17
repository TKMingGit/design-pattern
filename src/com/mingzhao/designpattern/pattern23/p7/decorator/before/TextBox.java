package com.mingzhao.designpattern.pattern23.p7.decorator.before;

/**
 * Created by SEELE on 2018/3/14.
 */
public class TextBox implements Component {
    @Override
    public void display() {
        System.out.println("文本框");
    }
}
