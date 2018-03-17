package com.mingzhao.designpattern.pattern23.p6.builder.practice;

/**
 * Created by luoyufeng on 2017/3/7.
 * 精简模式下只显示主窗口和控制条
 */
public class SimpleDisplayBuilder extends DisplayBuilder {
    @Override
    public void buildMenu() {
        displaySoftware.setMenu("精简模式显示菜单");
    }

    @Override
    public void buildDisplayList() {
        displaySoftware.setDisplayList("精简模式显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        displaySoftware.setMainWindow("精简模式显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        displaySoftware.setControlStrip("精简模式显示控制条");
    }

    @Override
    public void buildCollectionList() {
        displaySoftware.setCollectionList("精简模式显示收藏列表");
    }

    @Override
    public boolean hookMenu() {
        return true;
    }

    @Override
    public boolean hookDisplayList() {
        return true;
    }

    @Override
    public boolean hookCollectionList() {
        return true;
    }
}
