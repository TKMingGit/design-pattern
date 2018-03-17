package com.mingzhao.designpattern.pattern23.p6.abstractfactory.practice;

import com.mingzhao.designpattern.util.XMLUtil;

/**
 * Created by luoyufeng on 2017/3/6.
 */
public class ClientXML {
    public static void main(String[] args){
        GameFactory gameFactory = (GameFactory)XMLUtil.getBean("resource/config-abstract-factory.xml","className");
        InterfaceController symbianInterfaceController = gameFactory.createInterfaceController();
        OperationController symbianOperationController = gameFactory.createOperationController();
        symbianInterfaceController.show();
        symbianOperationController.show();
    }
}
