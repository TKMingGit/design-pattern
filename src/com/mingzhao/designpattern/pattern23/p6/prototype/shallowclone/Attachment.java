package com.mingzhao.designpattern.pattern23.p6.prototype.shallowclone;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class Attachment {
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
