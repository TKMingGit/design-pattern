package com.mingzhao.designpattern.pattern23.p6.abstractfactory.practice;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class SymbianGameFactory extends GameFactory{
    public OperationController createOperationController(){
        System.out.println("塞班公司设定手机操作控制");
        return new SymbianOperationController();
    }
    public InterfaceController createInterfaceController(){
        System.out.println("塞班公司设定手机界面控制");
        return new SymbianInterfaceController();
    }
}
