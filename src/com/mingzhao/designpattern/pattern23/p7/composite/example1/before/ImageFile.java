package com.mingzhao.designpattern.pattern23.p7.composite.example1.before;

/**
 * Created by SEELE on 2018/3/13.
 */
public class ImageFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }
    public void killVirus() {
        //简化代码，模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
