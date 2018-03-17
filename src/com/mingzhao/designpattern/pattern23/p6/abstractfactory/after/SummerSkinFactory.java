package com.mingzhao.designpattern.pattern23.p6.abstractfactory.after;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SummerSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        System.out.println("夏天皮肤工厂创建夏天风格按钮");
        return new SummerButton();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("夏天皮肤工厂创建夏天风格复选框");
        return new SummerComboBox();
    }

    @Override
    public TextFile createTextFile() {
        System.out.println("夏天皮肤工厂创建夏天风格文本框");
        return new SummerTextFile();
    }
}
