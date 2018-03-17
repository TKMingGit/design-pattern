package com.mingzhao.designpattern.pattern23.p6.abstractfactory.after;

import com.mingzhao.designpattern.util.XMLUtil;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class ClientXML {
    public static void main(String[] args){
        SkinFactory skinFactory = (SkinFactory)XMLUtil.getBean("resource/config-abstract-factory.xml", "className");
        Button button = skinFactory.createButton();
        ComboBox comboBox = skinFactory.createComboBox();
        TextFile textFile = skinFactory.createTextFile();

        button.show();
        comboBox.show();
        textFile.show();
    }
}
