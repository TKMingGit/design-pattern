package com.mingzhao.designpattern.pattern23.p6.singleton.eager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by luoyufeng on 2017/3/6.
 * 懒汉式单例模式
 */
public class EagerLoadBalancer {
    private static EagerLoadBalancer instance = new EagerLoadBalancer();
    private List serverList = null;
    private EagerLoadBalancer(){
        serverList = new ArrayList();
    }
    public static EagerLoadBalancer getLoadBalancer(){
        return instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}
