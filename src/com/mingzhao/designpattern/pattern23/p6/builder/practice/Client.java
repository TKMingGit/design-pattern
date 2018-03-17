package com.mingzhao.designpattern.pattern23.p6.builder.practice;

import com.mingzhao.designpattern.util.XMLUtil;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class Client {
    public static void main(String[] args){
        DisplayBuilder displayBuilder = (DisplayBuilder) XMLUtil.getBean("resource/config-builder-practice.xml","className");
        DisplayController displayController = new DisplayController();
        DisplaySoftware displaySoftware = displayController.construct(displayBuilder);

        System.out.println(displaySoftware.getMenu());
        System.out.println(displaySoftware.getMainWindow());
        System.out.println(displaySoftware.getDisplayList());
        System.out.println(displaySoftware.getCollectionList());
        System.out.println(displaySoftware.getControlStrip());
    }
}
