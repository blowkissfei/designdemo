package com.fei.listdemo.objectdemo;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo.objectdemo
 * @date 2019/10/11 10:35
 * @Copyright © 2019
 */
public class student {
    private int id;
    private String name;
    private String address;
    private String sex;

    public student(int id, String name, String address, String sex) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
