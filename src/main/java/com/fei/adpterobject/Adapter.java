package com.fei.adpterobject;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.adapter
 * @date 2019/10/9 11:24
 * @Copyright © 2019
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
