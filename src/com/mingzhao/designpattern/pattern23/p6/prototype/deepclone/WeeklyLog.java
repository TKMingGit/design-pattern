package com.mingzhao.designpattern.pattern23.p6.prototype.deepclone;

import java.io.*;

/**
 * Created by luoyufeng on 2017/3/6.
 * 工作周报类WeeklyLog不再使用Java自带的克隆机制，而是通过序列化来从头实现对象的深克
 * 隆，我们需要重新编写clone()方法
 */
public class WeeklyLog implements Serializable {
    private String name;
    private String date;
    private String content;

    private Attachment attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (WeeklyLog)ois.readObject();
    }
}
