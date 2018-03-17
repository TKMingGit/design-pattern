package com.mingzhao.designpattern.pattern23.p6.singleton.iodh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by luoyufeng on 2017/3/6.
 * Initialization Demand Holder (IoDH)  单例模式
 */
public class IoDHLoadBalancer {
    private List serverList = null;
    private IoDHLoadBalancer(){
        serverList = new ArrayList();
    }
    private static class HolderClass {
        private final static IoDHLoadBalancer instance = new IoDHLoadBalancer();
    }
    public static IoDHLoadBalancer getLoadBalancer(){
        return HolderClass.instance;
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
