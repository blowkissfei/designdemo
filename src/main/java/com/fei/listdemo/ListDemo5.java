package com.fei.listdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo
 * @date 2019/10/9 17:23
 * @Copyright © 2019
 */
class Student {
    private int id;
    private String name;

    @Override
    public String toString() {
        return this.id + " " + this.name;
    }

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class ListDemo5 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student(1, "aaa");
        Student s2 = new Student(2, "bbb");
        Student s3 = new Student(3, "ccc");
        Student s4 = new Student(4, "ddd");
        Student s5 = new Student(1, "aaa");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list);
        System.out.println("=================");
        HashSet<Student> s = new HashSet<>(list);
        list.clear();
        list.addAll(s);
        System.out.println(list);


    }

}
