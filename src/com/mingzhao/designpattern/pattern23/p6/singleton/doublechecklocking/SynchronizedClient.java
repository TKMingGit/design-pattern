package com.mingzhao.designpattern.pattern23.p6.singleton.doublechecklocking;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SynchronizedClient {
    public static void main(String[] args){
        System.out.println("双重锁单例模式");

        SynchronizedLoadBalancer loadBalancer1,loadBalancer2,loadBalancer3,loadBalancer4;
        loadBalancer1 = SynchronizedLoadBalancer.getLoadBalancer();
        loadBalancer2 = SynchronizedLoadBalancer.getLoadBalancer();
        loadBalancer3 = SynchronizedLoadBalancer.getLoadBalancer();
        loadBalancer4 = SynchronizedLoadBalancer.getLoadBalancer();

        if( loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 &&loadBalancer3 == loadBalancer4){
            System.out.println("服务器负载均衡器具有唯一性！");
        }
        loadBalancer1.addServer("server1");
        loadBalancer2.addServer("server2");
        loadBalancer3.addServer("server3");
        loadBalancer4.addServer("server4");

        for(int i = 0 ; i < 10 ; i++){
            String server = loadBalancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
