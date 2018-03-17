package com.mingzhao.designpattern.pattern23.p6.abstractfactory.before;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class Client {
    public static void main(String[] args){
        ButtonFactory buttonFactory = new SpringButtonFactory();
        Button button =  buttonFactory.createFactory();
        button.show();
        buttonFactory = new SummerButtonFactory();
        button =buttonFactory.createFactory();
        button.show();

        ComboBoxFactory comboBoxFactory = new SpringComboBoxFactory();
        ComboBox comboBox = comboBoxFactory.create();
        comboBox.show();
        comboBoxFactory = new SummerComboBoxFactory();
        comboBox = comboBoxFactory.create();
        comboBox.show();

        TextFileFactory textFileFactory = new SpringTextFileFactory();
        TextFile textFile = textFileFactory.create();
        textFile.show();
        textFileFactory = new SummerTextFileFactory();
        textFile = textFileFactory.create();
        textFile.show();
    }
}
