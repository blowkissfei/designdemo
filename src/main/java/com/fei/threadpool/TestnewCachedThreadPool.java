package com.fei.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.threadpool
 * @date 2020/2/11 17:32
 * @Copyright © 2019
 */
public class TestnewCachedThreadPool {
/**
 * 核心池大小为0，线程池最大线程数目为最大整型，这意味着所有的任务一提交就会加入到阻塞队列中。当线程池中的线程60s没有执行任务就终止，阻塞队列为SynchronousQueue。SynchronousQueue的take操作需要put操作等待，put操作需要take操作等待，否则会阻塞（线程池的阻塞队列不能存储，所以当目前线程处理忙碌状态时，所以开辟新的线程来处理请求），线程进入wait set。总结下来：①这是一个可以无限扩大的线程池；②适合处理执行时间比较小的任务；③线程空闲时间超过60s就会被杀死，所以长时间处于空闲状态的时候，这种线程池几乎不占用资源；④阻塞队列没有存储空间，只要请求到来，就必须找到一条空闲线程去处理这个请求，找不到则在线程池新开辟一条线程。如果主线程提交任务的速度远远大于CachedThreadPool的处理速度，则CachedThreadPool会不断地创建新线程来执行任务，这样有可能会导致系统耗尽CPU和内存资源，所以在使用该线程池是，一定要注意控制并发的任务数，否则创建大量的线程可能导致严重的性能问题。
 */

public static void main(String[] args) {

    // 缓存线程池，无上限
    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    for (int i = 0; i < 100; i++) {
        cachedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
    }
    cachedThreadPool.shutdown();
}

}
