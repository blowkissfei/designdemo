package com.fei.factorymethod;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.factorymethod
 * @date 2019/10/9 10:01
 * @Copyright © 2019
 */
public class SendFactory3 {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
