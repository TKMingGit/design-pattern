package com.mingzhao.designpattern.pattern23.p6.prototype.shallowclone2;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class PPR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("PPR 不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《项目进展报告》");
    }
}
