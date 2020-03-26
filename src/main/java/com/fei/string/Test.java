package com.fei.string;

import org.apache.commons.lang3.StringUtils;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.string
 * @date 2019/10/16 10:48
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) {
        String str = "abcd**aaa*b****ccc***ddd**qqq";
        String str2 = "v6.7-191012-Beta";
        String str3 = "v5.2.1";
//        String[] split = StringUtils.split(str, "*");
        String[] split = StringUtils.split(str, "*");
        String[] split1 = StringUtils.split(str2, ".");
        String[] split2 = StringUtils.split(str3, ".");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println("=======================");
        for (String s2:split1){
            System.out.println(s2);
        }
        System.out.println("=======================");
        for (String s3:split2){
            System.out.println(s3);
        }




    }
}
