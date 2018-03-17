package com.mingzhao.designpattern.pattern23.p7.composite.example1.after;

/**
 * Created by SEELE on 2018/3/13.
 */
public class VideoFile extends AbstractFile {

    private String name;

    public VideoFile(String name){
        this.name = name;
    }
    public void add(AbstractFile abstractFile){
        System.out.println("视频文件不支持新增方法");
    };

    public void remove(AbstractFile abstractFile){
        System.out.println("视频文件不支持删除方法");
    }

    public AbstractFile getChild(int i){
        System.out.println("视频文件不支持获取子元素方法");
        return null;
    }

    public void killVirus(){
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}
