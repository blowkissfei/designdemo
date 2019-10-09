package com.fei.builder;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.abstractfactory
 * @date 2019/10/9 10:07
 * @Copyright © 2019
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms sender!");

    }
    @Override
    public String toString() {
        return "SmsSender{}";
    }

}

