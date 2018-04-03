package com.mingzhao.designpattern.pattern23.p7.facade.example1.after;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by SEELE on 2018/4/3.
 */
public class FileWriterOut {
    public void write(String encryptStr,String fileNameDes){
        System.out.println("保存密文，写入文件");
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(fileNameDes);
            char a[] = encryptStr.toCharArray();
            int n = 0, m = 0;
            fileWriter.write(a,0,a.length);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
