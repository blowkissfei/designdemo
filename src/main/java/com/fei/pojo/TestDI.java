package com.fei.pojo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.pojo
 * @date 2019/10/15 14:54
 * @Copyright © 2019
 */
public class TestDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }
}
