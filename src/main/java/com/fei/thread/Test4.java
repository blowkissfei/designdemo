package com.fei.thread;

import java.util.Arrays;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.thread
 * @date 2019/10/14 11:01
 * @Copyright © 2019
 */
public class Test4 {

    static char[] a = {'-','-','-','-','-'};
    static char v  = '*';


    public static void main(String[] args) {



        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (a){
                        for (int i = 0; i < a.length ; i++) {
                            a[i]=v;
                        }
                    }

                    v=(v=='*'?'-':'*');
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (a){
                        System.out.println(this.getName()+":"+Arrays.toString(a));
                    }

                }
            }
        }.start();


    }


}
