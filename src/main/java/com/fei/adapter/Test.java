package com.fei.adapter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.adapter
 * @date 2019/10/9 11:25
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();

    }
}
