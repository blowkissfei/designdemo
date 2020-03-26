package com.fei.thread;

import com.fei.adpterobject.Source;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.thread
 * @date 2019/10/14 10:46
 * @Copyright © 2019
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("main线程");
        final T1 t1 = new T1();
        t1.start();


        Thread t2 = new Thread() {
            @Override
            public void run() {
                //t2线程中，打断 t1线程的暂停状态
                System.out.println("按回车打断 t 线程");
                new Scanner(System.in).nextLine();
                t1.interrupt();
            }
        };
        t2.setDaemon(true);
        t2.start();

    }

    static class T1 extends Thread{
        @Override
        public void run() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            for (int i = 0; i <=10 ; i++) {
                String date = sdf.format(new Date());
                System.out.println("时间:"+date);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("谁TMD打醒我了");
                    break;
                }
            }
        }
    }



}
