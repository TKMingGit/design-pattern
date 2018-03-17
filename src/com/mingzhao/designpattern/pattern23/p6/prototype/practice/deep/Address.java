package com.mingzhao.designpattern.pattern23.p6.prototype.practice.deep;

import java.io.Serializable;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class Address implements Serializable{
    private String province;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
