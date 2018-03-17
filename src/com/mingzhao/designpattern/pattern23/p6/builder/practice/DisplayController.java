package com.mingzhao.designpattern.pattern23.p6.builder.practice;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class DisplayController {
    public DisplaySoftware construct(DisplayBuilder displayBuilder){
        DisplaySoftware displaySoftware ;
        if(!displayBuilder.hookMenu()){
            displayBuilder.buildMenu();
        }
        if(!displayBuilder.hookDisplayList()){
            displayBuilder.buildDisplayList();
        }
        if(!displayBuilder.hookMainWindow()){
            displayBuilder.buildMainWindow();
        }
        if(!displayBuilder.hookControlStrip()){
            displayBuilder.buildControlStrip();
        }
        if(!displayBuilder.hookCollectionList()){
            displayBuilder.buildCollectionList();
        }
        displaySoftware = displayBuilder.getDisplaySoftware();
        return displaySoftware;
    }
}
