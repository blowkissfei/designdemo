package com.fei.pojo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.pojo
 * @date 2019/10/15 14:37
 * @Copyright © 2019
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hello hello1 = (Hello) ac.getBean("hello");

        Hello hello2 = (Hello) ac.getBean("hello");

        if (hello1==hello2){
            System.out.println("当然为单例");
        }else {
            System.out.println("当前实例为多实力");
        }



        /*System.out.println(hello1);
        hello1.sayHi();*/

    }

}
