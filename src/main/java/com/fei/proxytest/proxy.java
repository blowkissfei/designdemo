package com.fei.proxytest;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.proxytest
 * @date 2019/10/9 15:41
 * @Copyright © 2019
 */
public class proxy implements Sourceable {
    private Source source;

    public proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy");
    }

    private void before() {
        System.out.println("before proxy");
    }
}
