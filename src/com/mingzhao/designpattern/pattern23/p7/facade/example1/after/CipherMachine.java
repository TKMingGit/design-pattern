package com.mingzhao.designpattern.pattern23.p7.facade.example1.after;

/**
 * Created by SEELE on 2018/3/28.
 */
public class CipherMachine {
    public String Encrypt(String plainText){
        System.out.print("数据加密，将明文转换为密文：");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
           String c = String.valueOf((chars[i] % 7));
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
