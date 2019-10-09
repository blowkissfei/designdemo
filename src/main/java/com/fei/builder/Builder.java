package com.fei.builder;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.builder
 * @date 2019/10/9 10:40
 * @Copyright © 2019
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
            System.out.println(list);
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
            System.out.println(list);
        }
    }

}
