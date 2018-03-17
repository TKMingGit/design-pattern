package com.mingzhao.designpattern.pattern23.p7.decorator.after;

/**
 * Created by SEELE on 2018/3/14.
 */
public class Client {
    public static void main(String[] args){
        Component component,componentSB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();

        Component componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
