package com.mingzhao.designpattern.pattern23.p6.builder.example;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class ActorController {
    public Actor construct(ActorBuilder actorBuilder){
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairStyle();
        actor = actorBuilder.createActor();
        return actor;
    }
}
