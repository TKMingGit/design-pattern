package com.mingzhao.designpattern.pattern23.p6.abstractfactory.after;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class Client {
    public static void main(String[] args){
        SkinFactory skinFactory = new SpringSkinFactory();
        Button button = skinFactory.createButton();
        ComboBox comboBox = skinFactory.createComboBox();
        TextFile textFile = skinFactory.createTextFile();

        button.show();
        comboBox.show();
        textFile.show();

        skinFactory = new SummerSkinFactory();
        button = skinFactory.createButton();
        comboBox = skinFactory.createComboBox();
        textFile = skinFactory.createTextFile();

        button.show();
        comboBox.show();
        textFile.show();

        skinFactory = new AutumnSkinFactory();
        button = skinFactory.createButton();
        comboBox = skinFactory.createComboBox();
        textFile = skinFactory.createTextFile();
        button.show();
        comboBox.show();
        textFile.show();

    }
}
