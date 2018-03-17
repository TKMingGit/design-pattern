package com.mingzhao.designpattern.pattern23.p6.prototype.practice.deep;

import java.io.*;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class Customer implements Serializable {
    private String name;
    private Address address;

    public Customer cloneCustomer() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (Customer)ois.readObject();
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
