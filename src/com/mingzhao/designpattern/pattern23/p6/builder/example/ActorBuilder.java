package com.mingzhao.designpattern.pattern23.p6.builder.example;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairStyle();
    public Actor createActor(){
        return actor;
    }
}
