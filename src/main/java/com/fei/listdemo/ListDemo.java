package com.fei.listdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo
 * @date 2019/10/9 15:59
 * @Copyright © 2019
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        System.out.println(list);
        System.out.println(frequency(list,"a"));
        System.out.println(frequency(list,"b"));
        System.out.println(frequency(list,"c"));
        System.out.println(frequency(list,"d"));
        System.out.println(frequency(list,"xxx"));
    }

    private static int frequency(List<String> list, String s) {
        int count = 0;
        for (int i = list.size()-1; i >0; i--) {
            if (list.get(i).equals(s)){
                count++;
            }
        }

        return count;
    }
}
