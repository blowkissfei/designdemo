package com.fei.proxytest;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.proxytest
 * @date 2019/10/9 15:40
 * @Copyright © 2019
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this my source method!");
    }
}
