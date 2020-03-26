package com.fei.threadpool;

import java.io.Serializable;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.threadpool
 * @date 2020/2/11 15:55
 * @Copyright © 2019
 */
public class ThreadPoolTask implements Runnable, Serializable {

    private Object threadPoolTaskData;
    private static int produceTaskSleepTime=1000;

    public ThreadPoolTask(Object threadPoolTaskData) {
        this.threadPoolTaskData = threadPoolTaskData;
    }

    @Override
    public void run() {
// TODO Auto-generated method stub
        System.out.println("start..."+threadPoolTaskData);
        try {
            //模拟线程正在执行任务
            Thread.sleep(produceTaskSleepTime);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("stop..."+threadPoolTaskData);
        threadPoolTaskData = null;


    }

    public Object getThreadPoolTaskData() {
        return threadPoolTaskData;
    }
}
