package com.fei.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.threadpool
 * @date 2020/2/11 17:24
 * @Copyright © 2019
 */
public class TestnewFixedThreadPool {

    /**
     *  FixedThreadPool 是通过 java.util.concurrent.Executors 创建的 ThreadPoolExecutor 实例。这个实例会复用 固定数量的线程处理一个共享的无边界队列 。任何时间点，最多有 nThreads 个线程会处于活动状态执行任务。如果当所有线程都是活动时，有多的任务被提交过来，那么它会一致在队列中等待直到有线程可用。如果任何线程在执行过程中因为错误而中止，新的线程会替代它的位置来执行后续的任务。所有线程都会一致存于线程池中，直到显式的执行 ExecutorService.shutdown() 关闭。由于阻塞队列使用了LinkedBlockingQueue，是一个无界队列，因此永远不可能拒绝任务。LinkedBlockingQueue在入队列和出队列时使用的是不同的Lock，意味着他们之间不存在互斥关系，在多CPU情况下，他们能正在在同一时刻既消费，又生产，真正做到并行。因此这种线程池不会拒绝任务，而且不会开辟新的线程，也不会因为线程的长时间不使用而销毁线程。这是典型的生产者----消费者问题，这种线程池适合用在稳定且固定的并发场景，比如服务器。下面代码给出一个固定线程数的DEMO，每个核绑定了5个线程。
     * @param args
     */
    public static void main(String[] args) {
        // 获取计算机有几个核
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);

        ExecutorService threadPool = Executors.newFixedThreadPool(processors * 5);
        // 第一种线程池:固定个数的线程池,可以为每个CPU核绑定一定数量的线程数
        for (int i = 0; i < 50; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        threadPool.shutdown();

    }

}
