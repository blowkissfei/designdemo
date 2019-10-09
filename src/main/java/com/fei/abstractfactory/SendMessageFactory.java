package com.fei.abstractfactory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.abstractfactory
 * @date 2019/10/9 10:20
 * @Copyright © 2019
 */
public class SendMessageFactory implements Provider {
    @Override
    public Sender produce() {
        return new MsessageSender();
    }
}
