package com.mingzhao.designpattern.pattern23.p6.builder.practice;

/**
 * Created by luoyufeng on 2017/3/7.
 * 完整模式下将显示菜单、播放列表、主窗口、控制条
 */
public class WholeDisplayBuilder extends DisplayBuilder {
    @Override
    public void buildMenu() {
        displaySoftware.setMenu("完整模式显示菜单");
    }

    @Override
    public void buildDisplayList() {
        displaySoftware.setDisplayList("完整模式显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        displaySoftware.setMainWindow("完整模式显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        displaySoftware.setControlStrip("完整模式显示控制条");
    }

    @Override
    public void buildCollectionList() {
        displaySoftware.setCollectionList("完整模式显示收藏列表");
    }

    @Override
    public boolean hookCollectionList() {
        return true;
    }
}
