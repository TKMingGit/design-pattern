package com.mingzhao.designpattern.pattern23.p6.abstractfactory.before;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SummerTextFileFactory extends  TextFileFactory{
    @Override
    public TextFile create() {
        System.out.println("文本框工厂创建夏天风格文本框");
        return new SummerTextFile();
    }
}
