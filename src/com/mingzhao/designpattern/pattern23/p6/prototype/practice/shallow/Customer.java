package com.mingzhao.designpattern.pattern23.p6.prototype.practice.shallow;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class Customer implements Cloneable {
    private String name;
    private Address address;

    public Customer clone(){
        Customer customer = null;
        try {
            customer = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持复制");
        }
        return customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
