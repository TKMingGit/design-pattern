package com.mingzhao.designpattern.pattern23.p7.decorator.after;

/**
 * Created by SEELE on 2018/3/14.
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display(){
        this.set();
        super.display();
    }

    public void set(){
        System.out.println("设置黑边框");
    }
}
