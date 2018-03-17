package com.mingzhao.designpattern.pattern23.p6.builder.example;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("飘逸");
    }
}
