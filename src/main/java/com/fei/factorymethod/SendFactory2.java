package com.fei.factorymethod;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.factorymethod
 * @date 2019/10/9 9:56
 * @Copyright © 2019
 */
public class SendFactory2 {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
