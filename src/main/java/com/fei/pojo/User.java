package com.fei.pojo;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.pojo
 * @date 2019/10/15 14:52
 * @Copyright © 2019
 */
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
