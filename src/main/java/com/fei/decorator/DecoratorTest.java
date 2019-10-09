package com.fei.decorator;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.decorator
 * @date 2019/10/9 14:44
 * @Copyright © 2019
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
        System.out.println("=====================");
        source.method();
    }
}
