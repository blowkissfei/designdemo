package com.fei.proxy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.proxy
 * @date 2019/10/9 14:49
 * @Copyright © 2019
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
