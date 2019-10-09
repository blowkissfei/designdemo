package com.fei.abstractfactory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.abstractfactory
 * @date 2019/10/9 10:18
 * @Copyright © 2019
 */
public class MsessageSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is messageSender!");
    }
}
