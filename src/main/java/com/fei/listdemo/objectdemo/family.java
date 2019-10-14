package com.fei.listdemo.objectdemo;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo.objectdemo
 * @date 2019/10/11 10:39
 * @Copyright © 2019
 */
public class family {
    private int id;
    private String name;
    private String address;

    public family(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "family{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
