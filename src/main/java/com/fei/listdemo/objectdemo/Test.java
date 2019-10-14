package com.fei.listdemo.objectdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo.objectdemo
 * @date 2019/10/11 10:40
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new student(1,"dengfeiwen","london","man"));
        list.add(new teacher(1,"beautifull","girls"));
        list.add(new family(2,"dad","china"));
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("=========================");

        Map<String, Object> map = new HashMap<>();
        map.put("no:1",new student(2,"denghui","berlin","girls"));
        map.put("no:2",new teacher(1,"liu","girls"));
        map.put("no:3",new family(2,"dad","china"));
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        for (Object value : map.values()) {
            System.out.println(value);
        }

    }
}
