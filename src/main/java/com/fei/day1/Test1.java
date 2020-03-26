package com.fei.day1;

import java.time.Year;
import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.day1
 * @date 2019/10/14 17:07
 * @Copyright © 2019
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入年号:");
        int year = new Scanner(System.in).nextInt();
        String str = "平年";
        if(year%4==0){
            if (year%100!=0){
                str="闰年";
            }
        }

        if (year%400==0){
            str="闰年";
        }

        //3，优化，两个条件满足其一既是闰年

        if((year%4==0&&year%100!=0)||year%400==0){
            str="闰年";
        }

        System.out.println(year+"年是"+str);
    }




}
