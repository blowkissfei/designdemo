package com.fei.decorator;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.decorator
 * @date 2019/10/9 14:35
 * @Copyright © 2019
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
