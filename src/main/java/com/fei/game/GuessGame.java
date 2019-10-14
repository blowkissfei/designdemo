package com.fei.game;

import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.game
 * @date 2019/10/12 11:18
 * @Copyright © 2019
 */
public abstract class GuessGame {
    public void start(){
        String r = suiJi();
        System.out.println("随机值为:"+r);
        tiShi();
        while (true){
            System.out.println("猜:");
            String c = new Scanner(System.in).nextLine();
            String jieGuo;
            try {
                jieGuo=biDui(c,r);
            }catch (Exception e){
                System.out.println("输入错误，请重试");
                continue;
            }
            System.out.println(jieGuo);
            if (caiDui(jieGuo)){
                break;
            }






        }
    }

    protected abstract boolean caiDui(String jieGuo);

    protected abstract String biDui(String c, String r);

    protected abstract void tiShi();

    protected abstract String suiJi();
}
