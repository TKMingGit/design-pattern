package com.mingzhao.designpattern.pattern23.p6.abstractfactory.practice;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public abstract class GameFactory {
    public abstract OperationController createOperationController();
    public abstract InterfaceController createInterfaceController();
}
