package com.mingzhao.designpattern.pattern23.p6.builder.example;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("光头");
    }
}
