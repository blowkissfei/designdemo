package com.fei.listdemo.objectdemo;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo.objectdemo
 * @date 2019/10/11 10:37
 * @Copyright © 2019
 */
public class teacher {
    private int id;
    private String name;
    private String sex;

    public teacher(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
