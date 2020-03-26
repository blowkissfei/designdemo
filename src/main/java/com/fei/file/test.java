package com.fei.file;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.file
 * @date 2019/10/14 10:04
 * @Copyright © 2019
 */
public class test {
    public static void main(String[] args) {
        System.out.println("输入文件夹");
        String s = new Scanner(System.in).nextLine();
        File dir = new File(s);
        if (!dir.isDirectory()){
            System.out.println("请输入正确的文件夹");
            return;
        }
        System.out.println("test...............");
        long size = dirLength(dir);
        System.out.println("文件夹的大小为:"+size+"kb");


    }

    private static long dirLength(File dir) {
        LinkedList<File> list = new LinkedList<>();
        list.add(dir);
        long sum = 0;
        while (list.size() !=0){
            //从头部弹出
            File pop = list.pop();//removeFirst()
            if (pop.isFile()){  //是文件
                sum+=pop.length();
            }else {  //是文件夹
                File[] files = pop.listFiles();
                if (files==null){
                    continue;
                }
                for (File file : files) {
                    list.push(file);//addFirst()
                }
            }

        }


        return sum;
    }

}
