package com.mingzhao.designpattern.pattern23.p6.builder.examplehook;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class AngelBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("披肩长发");
    }
}
