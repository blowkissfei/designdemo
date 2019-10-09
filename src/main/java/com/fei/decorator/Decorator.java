package com.fei.decorator;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.decorator
 * @date 2019/10/9 14:37
 * @Copyright © 2019
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source=source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
