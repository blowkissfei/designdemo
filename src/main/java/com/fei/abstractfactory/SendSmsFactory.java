package com.fei.abstractfactory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.abstractfactory
 * @date 2019/10/9 10:10
 * @Copyright © 2019
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
