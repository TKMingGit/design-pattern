package com.mingzhao.designpattern.pattern23.p6.singleton.lazy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by luoyufeng on 2017/3/6.
 * 懒汉式单例模式
 */
public class LazyLoadBalancer {
    private static LazyLoadBalancer instance = null;
    private List serverList = null;
    private LazyLoadBalancer(){
        serverList = new ArrayList();
    }
    public static LazyLoadBalancer getLoadBalancer(){
        if(instance == null){
            instance =  new LazyLoadBalancer();
        }
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
