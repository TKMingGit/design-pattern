package com.mingzhao.designpattern.pattern23.p7.facade.example1.after;

/**
 * Created by SEELE on 2018/4/3.
 */
public class Client {
    public static void main(String[] args){
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src.txt","des.txt");
        System.out.println("客户端访问操作完成");
    }
}
