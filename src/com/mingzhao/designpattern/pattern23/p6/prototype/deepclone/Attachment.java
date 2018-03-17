package com.mingzhao.designpattern.pattern23.p6.prototype.deepclone;

import java.io.Serializable;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class Attachment implements Serializable {
    public String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void download()
    {
        System.out.println("下载附件，文件名为" + name);
    }
}
