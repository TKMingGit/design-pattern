package com.mingzhao.designpattern.pattern23.p6.prototype.shallowclone;

/**
 * Created by luoyufeng on 2017/3/6.
 * 浅克隆
 */
public class ShallowClient {
    public static void main(String args[])
    {
        WeeklyLog log_previous ,log_new;
        Attachment attachment = new Attachment();
        log_previous = new WeeklyLog();
        log_previous.setAttachment(attachment);
        log_new = log_previous.clone();

        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getAttachment() == log_new.getAttachment());

       /* WeeklyLog log_previous = new WeeklyLog(); //创建原型对象
        Attachment attachment = new Attachment();
        attachment.setName("excel");
        log_previous.setAttachment(attachment);
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        System.out.println("****周报****");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getName());
        System.out.println("内容：" + log_previous.getContent());
        System.out.println("附件：" );
        log_previous.getAttachment().download();

        System.out.println("--------------------------------");
        WeeklyLog log_new;
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        log_new.setDate("第13周");
        log_new.getAttachment().setName("ppt");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());
        System.out.println("附件：" );
        log_previous.getAttachment().download();*/
    }
}
