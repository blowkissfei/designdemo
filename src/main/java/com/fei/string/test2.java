package com.fei.string;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.string
 * @date 2019/10/16 11:09
 * @Copyright © 2019
 */
public class test2 {


    public static void main(String[] args) {

        String str = "abcd**aaa*b****ccc***ddd**qqq";
        String str2 = "v6.7-191012-Beta";
        String str3 = "5.2.1";

        String[] split = StringUtils.split(str3, ".");

        for (String s:split){
            System.out.println(s);
            }
        System.out.println("=============");
        int[] array = new int[split.length];

        int i =0;
        while (i<split.length){
            array[i]=Integer.parseInt(split[i]);
            i++;
        }

        System.out.println(Arrays.toString(array));

    }
}
