package com.mingzhao.designpattern.pattern23.p7.facade.example1;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by SEELE on 2018/3/27.
 */
public class FilePractice {
    public static void main(String[] args){
        int b;
        byte buffer[] =new byte[20];
        System.out.println("输入一行文本，并存入磁盘");
        FileOutputStream fos = null;
        try {
            b = System.in.read(buffer);
            fos = new FileOutputStream("line.txt");
            System.out.println("b: " + b);
            fos.write(buffer,0,b);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
