package com.fei.factorymethod;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.factorymethod
 * @date 2019/10/9 9:49
 * @Copyright © 2019
 */
public class FactoryTest {
    public static void main(String[] args) {
        /*SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("mail");
        sender.send();*/

        /*SendFactory2 sendFactory2 = new SendFactory2();
//        Sender sender = sendFactory2.produceMail();
        Sender sender = sendFactory2.produceSms();
        sender.send();*/

        Sender sender = SendFactory3.produceMail();
        sender.send();


    }
}
