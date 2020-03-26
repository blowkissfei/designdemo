package com.fei.thread;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.thread
 * @date 2019/10/14 10:35
 * @Copyright © 2019
 */
public class Test2 {
    public static void main(String[] args) {
        R1 r1 = new R1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        //线程启动后，自动执行 r.run()
        t1.start();
        t2.start();
    }

    static class R1 implements Runnable{

        @Override
        public void run() {
            //获取正在执行这段代码的线程对象
            Thread thread = Thread.currentThread();
            //获取当前现场名
            String name = thread.getName();
            for (int i = 0; i <=10 ; i++) {
                System.out.println(name+"线程:"+i);
            }
        }
    }


}
