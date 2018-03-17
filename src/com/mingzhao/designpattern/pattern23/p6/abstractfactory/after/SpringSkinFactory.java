package com.mingzhao.designpattern.pattern23.p6.abstractfactory.after;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SpringSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        System.out.println("春天皮肤工厂创建春天风格按钮");
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("春天皮肤工厂创建春天风格复选框");
        return new SpringComboBox();
    }

    @Override
    public TextFile createTextFile() {
        System.out.println("春天皮肤工厂创建春天风格文本框");
        return new SpringTextFile();
    }
}
