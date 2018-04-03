package com.mingzhao.designpattern.pattern23.p7.facade.example1.after;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by SEELE on 2018/3/27.
 */
public class FileReaderIn {
    public String read(String fileNameSrc){
        System.out.print("读取文件，获取明文：");
        String sb = null;
        FileReader fr = null; //只适用于阅读单行文件
        try{
            fr = new FileReader(fileNameSrc);
            int data;
            char tom[] = new char[10];
            while ((data = fr.read(tom,0,10)) != -1){
                if(sb == null){
                    sb = new String();
                }
                sb += new String(tom,0,data);
            }
            System.out.println(sb);
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if( fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb;
    }
}
