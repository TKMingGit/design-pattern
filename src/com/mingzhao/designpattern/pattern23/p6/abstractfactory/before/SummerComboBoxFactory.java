package com.mingzhao.designpattern.pattern23.p6.abstractfactory.before;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SummerComboBoxFactory extends ComboBoxFactory {
    @Override
    public SummerComboBox create() {
        System.out.println("复选框工厂创建夏天风格复选框");
        return new SummerComboBox();
    }
}
