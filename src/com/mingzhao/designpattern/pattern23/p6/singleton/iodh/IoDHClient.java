package com.mingzhao.designpattern.pattern23.p6.singleton.iodh;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class IoDHClient {
    public static void main(String[] args){
        System.out.println("IoDH单例模式");

        IoDHLoadBalancer eagerLoadBalancer1, eagerLoadBalancer2, eagerLoadBalancer3, eagerLoadBalancer4;
        eagerLoadBalancer1 = IoDHLoadBalancer.getLoadBalancer();
        eagerLoadBalancer2 = IoDHLoadBalancer.getLoadBalancer();
        eagerLoadBalancer3 = IoDHLoadBalancer.getLoadBalancer();
        eagerLoadBalancer4 = IoDHLoadBalancer.getLoadBalancer();

        if( eagerLoadBalancer1 == eagerLoadBalancer2 && eagerLoadBalancer2 == eagerLoadBalancer3 && eagerLoadBalancer3 == eagerLoadBalancer4){
            System.out.println("服务器负载均衡器具有唯一性！");
        }
        eagerLoadBalancer1.addServer("server1");
        eagerLoadBalancer2.addServer("server2");
        eagerLoadBalancer3.addServer("server3");
        eagerLoadBalancer4.addServer("server4");

        for(int i = 0 ; i < 20 ; i++){
            String server = eagerLoadBalancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
