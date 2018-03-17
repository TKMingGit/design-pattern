package com.mingzhao.designpattern.pattern23.p6.abstractfactory.practice;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class AndroidGameFactory extends GameFactory{
    public OperationController createOperationController(){
        System.out.println("安卓公司设定手机操作控制");
        return new AndroidOperationController();
    }
    public InterfaceController createInterfaceController(){
        System.out.println("安卓公司设定手机界面控制");
        return new AndroidInterfaceController();
    }
}
