package com.fei.proxy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.proxy
 * @date 2019/10/9 14:50
 * @Copyright © 2019
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source =new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}
