package com.fei.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.threadpool
 * @date 2020/2/11 15:39
 * @Copyright © 2019
 */
public class ThreadPoolTest {
    private static final int COREPOOLSIZE=2;
    private static final int MAXPOOLSIZE=5;
    private static final long KEEPALIVETIME=4;
    private static final TimeUnit UNIT = TimeUnit.SECONDS;
    private static final BlockingQueue<Runnable> WORKQUEUE
            = new ArrayBlockingQueue<Runnable>(3);
    private static final ThreadPoolExecutor.AbortPolicy HANDER
            = new ThreadPoolExecutor.AbortPolicy();

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(COREPOOLSIZE, MAXPOOLSIZE, KEEPALIVETIME,
                UNIT, WORKQUEUE, HANDER);

        for (int i = 0; i < 11; i++) {
            String task = "task@"+i;
            System.out.println("put->"+task);

            executor.execute(new ThreadPoolTask("feiTask||"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            executor.shutdown();//关闭主线程，但线程池会继续运行，直到所有任务执行完才会停止。若不调用该方法线程池会一直保持下去，以便随时添加新的任务

        }

    }
}
