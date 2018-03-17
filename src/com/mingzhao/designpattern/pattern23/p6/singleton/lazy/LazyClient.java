package com.mingzhao.designpattern.pattern23.p6.singleton.lazy;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class LazyClient {
    public static void main(String[] args){
        System.out.println("懒汉单例模式");

        LazyLoadBalancer lazyLoadBalancer1, lazyLoadBalancer2, lazyLoadBalancer3, lazyLoadBalancer4;
        lazyLoadBalancer1 = LazyLoadBalancer.getLoadBalancer();
        lazyLoadBalancer2 = LazyLoadBalancer.getLoadBalancer();
        lazyLoadBalancer3 = LazyLoadBalancer.getLoadBalancer();
        lazyLoadBalancer4 = LazyLoadBalancer.getLoadBalancer();

        if( lazyLoadBalancer1 == lazyLoadBalancer2 && lazyLoadBalancer2 == lazyLoadBalancer3 && lazyLoadBalancer3 == lazyLoadBalancer4){
            System.out.println("服务器负载均衡器具有唯一性！");
        }
        lazyLoadBalancer1.addServer("server1");
        lazyLoadBalancer2.addServer("server2");
        lazyLoadBalancer3.addServer("server3");
        lazyLoadBalancer4.addServer("server4");

        for(int i = 0 ; i < 10 ; i++){
            String server = lazyLoadBalancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
