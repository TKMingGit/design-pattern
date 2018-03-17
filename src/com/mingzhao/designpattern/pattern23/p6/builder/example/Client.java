package com.mingzhao.designpattern.pattern23.p6.builder.example;

import com.mingzhao.designpattern.util.XMLUtil;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class Client {
    public static void main(String args[]){
        ActorBuilder ab;
        ab = (ActorBuilder) XMLUtil.getBean("resource/config-builder.xml","className");
        ActorController actorController = new ActorController();
        Actor actor;
        actor = actorController.construct(ab);

        System.out.println(actor.getType() + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairStyle());
    }
}
