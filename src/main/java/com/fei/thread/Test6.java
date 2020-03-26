package com.fei.thread;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.thread
 * @date 2019/10/14 11:24
 * @Copyright © 2019
 */
public class Test6 {
    public static void main(String[] args) {

        R1 r1 = new R1();
        Thread t = new Thread(r1);
        t.start();

        R1 r2 = new R1();
        while (true){
            int i = r2.get();
            if(i%2==1){
                System.out.println(i);
                System.exit(0);//关闭虚拟机
            }
        }


    }


    static class R1 implements Runnable{
        static int i;
        public static void add(){
            i++;
            i++;
        }
        public static int get(){
            return i;
        }
        @Override
        public void run() {
            while (true){
                add();
            }
        }
    }


}
