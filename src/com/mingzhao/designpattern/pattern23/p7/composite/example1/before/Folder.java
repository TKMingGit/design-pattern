package com.mingzhao.designpattern.pattern23.p7.composite.example1.before;

import java.util.ArrayList;

/**
 * Created by SEELE on 2018/3/13.
 */
public class Folder {
    private String name;
    //定义集合folderList，用于存储Folder类型的成员
    private ArrayList<Folder> folderList = new ArrayList<Folder>();
    //定义集合imageList，用于存储ImageFile类型的成员
    private ArrayList<ImageFile> imageList = new ArrayList<ImageFile>();
    //定义集合textList，用于存储TextFile类型的成员
    private ArrayList<TextFile> textList = new ArrayList<TextFile>();
    public Folder(String name) {
        this.name = name;
    }
    //增加新的Folder类型的成员
    public void addFolder(Folder f) {
        folderList.add(f);
    }
    //增加新的ImageFile类型的成员
    public void addImageFile(ImageFile image) {
        imageList.add(image);
    }
    //增加新的TextFile类型的成员
    public void addTextFile(TextFile text) {
        textList.add(text);
    }
    //删除成员
    public void removeFolder(){

    };
    public void removeImageFile(){

    };
    public void removeTextFile(){

    };
    //获取成员
    public void getChildFolder(int i){

    };
    public void getChildImageFile(int i){

    };
    public void getChildTextFile(int i){

    };
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒"); //模拟杀毒
        //如果是Folder类型的成员，递归调用Folder的killVirus()方法
        for (Object obj : folderList) {
            ((Folder) obj).killVirus();
        }
        //如果是ImageFile类型的成员，调用ImageFile的killVirus()方法
        for (Object obj : imageList) {
            ((ImageFile) obj).killVirus();
        }
        //如果是TextFile类型的成员，调用TextFile的killVirus()方法
        for (Object obj : textList) {
            ((TextFile) obj).killVirus();
        }
    }
}

