package com.mingzhao.designpattern.pattern23.p7.adapter.example1;

/**
 * Created by luoyufeng on 2017/3/9.
 */
public interface ScoreOperation {
    public int[] sort(int array[]); //成绩排序
    public int search(int array[],int key); //成绩查找
}
