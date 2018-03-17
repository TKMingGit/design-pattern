package com.mingzhao.designpattern.pattern23.p6.builder.practice;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public abstract class DisplayBuilder {
    protected DisplaySoftware displaySoftware = new DisplaySoftware();
    public abstract void buildMenu();
    public abstract void buildDisplayList();
    public abstract void buildMainWindow();
    public abstract void buildControlStrip();
    public abstract void buildCollectionList();

    public boolean hookMenu(){
        return false;
    }
    public boolean hookDisplayList(){
        return false;
    }
    public boolean hookMainWindow(){
        return false;
    }
    public boolean hookControlStrip(){
        return false;
    }
    public boolean hookCollectionList(){
        return false;
    }
    public DisplaySoftware getDisplaySoftware(){
        return displaySoftware;
    }
}
