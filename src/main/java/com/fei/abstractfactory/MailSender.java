package com.fei.abstractfactory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.abstractfactory
 * @date 2019/10/9 10:06
 * @Copyright © 2019
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailSender!");
    }
}
