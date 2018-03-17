package com.mingzhao.designpattern.pattern23.p6.singleton.doublechecklocking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by luoyufeng on 2017/3/6.
 * 懒汉单例模式
 */
public class SynchronizedLoadBalancer {
    private volatile static SynchronizedLoadBalancer instance = null;
    private List serverList = null;
    private SynchronizedLoadBalancer(){
        serverList = new ArrayList();
    }
    public static SynchronizedLoadBalancer getLoadBalancer(){
        if(instance == null){
            //懒汉单例模式双重检查锁
            synchronized (SynchronizedLoadBalancer.class){
                if(instance == null){
                    instance =  new SynchronizedLoadBalancer();
                }
            }
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
