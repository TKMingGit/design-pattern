package com.mingzhao.designpattern.pattern23.p6.prototype.shallowclone2;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public interface OfficialDocument extends Cloneable {
    public OfficialDocument clone();
    public void display();
}
