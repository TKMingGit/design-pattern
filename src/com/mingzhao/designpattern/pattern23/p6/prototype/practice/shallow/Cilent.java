package com.mingzhao.designpattern.pattern23.p6.prototype.practice.shallow;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class Cilent {
    public static  void main(String[] args){
        Customer customer1,customer2;
        customer1 = new Customer();
        Address address = new Address();
        customer1.setAddress(address);

        customer2 = customer1.clone();

        System.out.println(customer1 == customer2);
        System.out.println(customer1.getAddress() == customer2.getAddress());
    }
}