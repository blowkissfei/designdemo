package com.fei.proxytest;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.proxytest
 * @date 2019/10/9 15:45
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new proxy();
        source.method();
    }
}
