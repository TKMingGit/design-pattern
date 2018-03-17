package com.mingzhao.designpattern.pattern23.p6.prototype.shallowclone2;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class Client {
    public static void main(String[] args){
        PrototypeManage pm = PrototypeManage.getPrototypeManage();
        OfficialDocument o1,o2,o3,o4,o5,o6;
        o1 = pm.getOfficialDocument("SRS");
        o1.display();
        o2 = pm.getOfficialDocument("SRS");
        o2.display();
        System.out.println(o1==o2);


        o3 = pm.getOfficialDocument("FAR");
        o3.display();
        o4 = pm.getOfficialDocument("FAR");
        o4.display();
        System.out.println(o3==o4);

        o5 = pm.getOfficialDocument("PPR");
        o5.display();
        o6 = pm.getOfficialDocument("PPR");
        o6.display();
        System.out.println(o5==o6);
    }
}
