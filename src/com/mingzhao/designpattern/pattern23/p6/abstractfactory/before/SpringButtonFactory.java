package com.mingzhao.designpattern.pattern23.p6.abstractfactory.before;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SpringButtonFactory extends ButtonFactory {
    @Override
    public Button createFactory() {
        System.out.println("按钮工厂创建春天风格按钮");
        return new SpringButton();
    }
}
