package com.mingzhao.designpattern.pattern23.p7.bridge.example1.before;

/**
 * Created by SEELE on 2018/3/12.
 */
public class Client {
    public static void main(String[] args){
        BPMLinuxImp bpmLinuxImp = new BPMLinuxImp();
        bpmLinuxImp.platform();
    }
}
