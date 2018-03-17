package com.mingzhao.designpattern.pattern23.p6.prototype.shallowclone2;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("SRS 不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
