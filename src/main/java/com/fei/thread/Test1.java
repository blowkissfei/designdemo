package com.fei.thread;

/**
 * 1.继承 Thread
 *
 * 2.实现 Runnable
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.thread
 * @date 2019/10/14 10:26
 * @Copyright © 2019
 */
public class Test1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        //现场启动后自动执行run()方法
        System.out.println("启动第一个t1线程");
        t1.start();
        System.out.println("启动第一个t2线程");
        t2.start();
        System.out.println("main 线程");

    }

    static class T1 extends Thread{
        @Override
        public void run() {
            //获取线程名称
            String name = getName();
            //打印1到1000
            for (int i = 0; i <=10 ; i++) {
                System.out.println(name+"线程:"+i);
            }
        }
    }

}
