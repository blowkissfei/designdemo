package com.fei.adpterobject;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.adpterobject
 * @date 2019/10/9 11:29
 * @Copyright © 2019
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
