package com.mingzhao.designpattern.pattern23.p6.abstractfactory.before;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SpringTextFileFactory extends  TextFileFactory{
    @Override
    public TextFile create() {
        System.out.println("文本框工厂创建春天风格文本框");
        return new SpringTextFile();
    }
}
