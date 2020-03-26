package com.fei.completefutrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.completefutrue
 * @date 2020/2/10 17:14
 * @Copyright © 2019
 */
public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Result of the asynchronous computation";
            }
        });

        System.out.println("=====");
        String str = future.get();
        System.out.println(str);

    }
}
