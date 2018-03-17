package com.mingzhao.designpattern.pattern23.p6.builder.practice;

/**
 * Created by luoyufeng on 2017/3/7.
 * 记忆模式下将显示主窗口、控制条、收藏列表
 */
public class RememberDisplayBuilder extends DisplayBuilder {
    @Override
    public void buildMenu() {
        displaySoftware.setMenu("记忆模式显示菜单");
    }

    @Override
    public void buildDisplayList() {
        displaySoftware.setDisplayList("记忆模式显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        displaySoftware.setMainWindow("记忆模式显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        displaySoftware.setControlStrip("记忆模式显示控制条");
    }

    @Override
    public void buildCollectionList() {
        displaySoftware.setCollectionList("记忆模式显示收藏列表");
    }

    @Override
    public boolean hookMenu() {
        return true;
    }

    @Override
    public boolean hookDisplayList() {
        return true;
    }
}
