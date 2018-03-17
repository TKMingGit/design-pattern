package com.mingzhao.designpattern.pattern23.p6.prototype.deepclone;

import java.io.IOException;

/**
 * Created by luoyufeng on 2017/3/6.
 * 浅克隆
 */
public class DeepClient {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        WeeklyLog log_previous = null,log_new = null;
        Attachment attachment = new Attachment();
        log_previous = new WeeklyLog();
        log_previous.setAttachment(attachment);
        try {
            log_new = log_previous.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getAttachment() == log_new.getAttachment());

    }
}
