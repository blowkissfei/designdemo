package com.fei.listdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo
 * @date 2019/10/9 17:16
 * @Copyright © 2019
 */
public class ListDemo4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("abc");
        list.add("xyz");
        list.add("123");
        list.add("xyz");
        System.out.println("去掉重复元素前：");
        System.out.println(list);
        HashSet set = new HashSet(list);
        list.clear();
        list.addAll(set);
        System.out.println("去掉重复元素后：");
        System.out.println(list);


    }
}
