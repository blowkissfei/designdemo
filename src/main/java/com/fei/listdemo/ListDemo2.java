package com.fei.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 * (2)编写方法对List集合进行排序
 * (2)然后利用迭代器遍历集合元素并输出
 * (3)如：15 18 20 40 46 60 65 70 75 91
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo
 * @date 2019/10/9 16:22
 * @Copyright © 2019
 */
public class ListDemo2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Random random = new Random();
            int n = random.nextInt(100);
            list.add(n);
        }

        System.out.println("打印输出放入的list未排序前" + "\n" + list);

        listBubble(list);

        System.out.println("\n" + "生成迭代器对集合进行遍历：");

        for (Integer info : list) {

            System.out.println(info + " ");
        }
    }

    private static void listBubble(List<Integer> list) {
        System.out.println("对List集合进行冒泡排序：");
        for (int i = 0; i < list.size()-1 ; i++) {
            for (int j = 0; j < list.size()-1-i ; j++) {
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        System.out.println(list);
    }
}
