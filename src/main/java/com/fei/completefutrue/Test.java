package com.fei.completefutrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.completefutrue
 * @date 2020/2/10 16:56
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
                throw new IllegalStateException(e);
            }
            System.out.println(Thread.currentThread().getName()+"I'll run in a separate thread than the main thread.");
        });
        System.out.println(Thread.currentThread().getName()+"=============");
        future.get();
//        System.out.println("结果:"+future.get());

    }


}
