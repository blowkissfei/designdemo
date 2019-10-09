package com.fei.factorymethod;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.factorymethod
 * @date 2019/10/9 9:35
 * @Copyright © 2019
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
