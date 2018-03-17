package com.mingzhao.designpattern.pattern23.p6.abstractfactory.after;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class AutumnSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        System.out.println("秋天皮肤工厂创建秋天风格按钮");
        return new AutumnButton();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("秋天皮肤工厂创建秋天风格复选框");
        return new AutumnComboBox();
    }

    @Override
    public TextFile createTextFile() {
        System.out.println("秋天皮肤工厂创建秋天风格文本框");
        return new AutumnTextFile();
    }
}
