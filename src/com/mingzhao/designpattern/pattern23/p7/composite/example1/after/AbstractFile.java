package com.mingzhao.designpattern.pattern23.p7.composite.example1.after;

/**
 * Created by SEELE on 2018/3/13.
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile abstractFile);

    public abstract void remove(AbstractFile abstractFile);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();

}
