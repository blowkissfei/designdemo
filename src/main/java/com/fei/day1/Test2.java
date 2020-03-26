package com.fei.day1;

import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.day1
 * @date 2019/10/14 18:37
 * @Copyright © 2019
 */
public class Test2 {
    public static void main(String[] args) {
        /*int a = 5;
        System.out.println(a++);//5

        a = 5;
        System.out.println(++a);//6
        */

      /*  System.out.println("输入整数a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入整数b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("输入整数c:");
        int c = new Scanner(System.in).nextInt();
        int max = a>b?a:b;
        max=max>c?max:c;
        System.out.println(max);
        */

        System.out.println("\n\n------------------");
        f1();
        System.out.println("\n\n------------------");
        f2();


    }


    private static void f2() {
        for (int i = 0; i <=100 ; i++) {
            int y = i % 10;
            if (y==3||y==5||y==7){
                continue;
            }
            System.out.println(i);
        }
    }

    private static void f1() {

        for (int i = 0;; i++) {
            double d = Math.random();
            if (d>0.85){
                System.out.println("第"+i+"次:"+d);
                break;
            }
            System.out.println("第"+i+"次循环");
        }
    }
}
