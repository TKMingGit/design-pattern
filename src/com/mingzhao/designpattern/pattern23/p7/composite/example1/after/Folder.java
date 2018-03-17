package com.mingzhao.designpattern.pattern23.p7.composite.example1.after;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SEELE on 2018/3/13.
 */
public class Folder extends AbstractFile {
    private String name;
    private List<AbstractFile> abstractFileList = new ArrayList<AbstractFile>();

    public Folder(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        abstractFileList.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        abstractFileList.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return abstractFileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");
        for(Object obj : abstractFileList ){
            ((AbstractFile)obj).killVirus();
        }
    }
}
