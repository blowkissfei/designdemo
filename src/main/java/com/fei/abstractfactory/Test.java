package com.fei.abstractfactory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.abstractfactory
 * @date 2019/10/9 10:14
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) {
//        Provider provider = new SendMailFactory();
//        Provider provider=new SendSmsFactory();
        Provider provider=new SendMessageFactory();
        Sender sender = provider.produce();
        sender.send();


    }
}
