package com.fei.chat.reflect;

import com.sun.deploy.panel.ITreeNode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat.reflect
 * @date 2019/10/11 19:39
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) throws Exception {

        while (true){
            System.out.println("输入类名:");
            String s = new Scanner(System.in).nextLine();
            if ("exit".equals(s)){
                break;
            }
            //获得这个类的类对象
            Class<?> c = Class.forName(s);

            //反射操作，获得包名、类名
            String packge = c.getPackage().getName();
            String name = c.getName();
            String sname = c.getSimpleName();
            System.out.println("packge:"+packge);
            System.out.println("name:"+name);
            System.out.println("sname:"+sname);

            System.out.println("成员变量");
            f1(c);
            System.out.println("构造方法");
            f2(c);
            System.out.println("方法");
            f3(c);

        }
    }

    private static void f1(Class<?> c) {
        Field[] fields = c.getDeclaredFields();
        System.out.println("fields:"+fields.toString());
        for (Field field : fields) {
            String simpleName = field.getType().getSimpleName();
            String name = field.getName();
            System.out.println(simpleName+"||||"+name);
        }

    }

    private static void f2(Class<?> c) {
        Constructor<?>[] a = c.getDeclaredConstructors();
        for (Constructor<?> constructor : a) {
            Class<?>[] p = constructor.getParameterTypes();
            System.out.println(c.getSimpleName()+"("+ Arrays.toString(p) +")");
        }
    }

    private static void f3(Class<?> c) {
        Method[] a = c.getDeclaredMethods();
        for (Method method : a) {
            Class<?>[] p = method.getParameterTypes();
            System.out.println(method.getName()+"||"+Arrays.toString(p)+"||");
        }
    }
}
