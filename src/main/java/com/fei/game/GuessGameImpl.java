package com.fei.game;

import java.util.Random;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.game
 * @date 2019/10/12 17:18
 * @Copyright © 2019
 */
public class GuessGameImpl extends GuessGame {
    @Override
    protected boolean caiDui(String jieGuo) {
        return false;
    }

    @Override
    protected String biDui(String c, String r) {
        return null;
    }

    @Override
    protected void tiShi() {

    }

    @Override
    protected String suiJi() {
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        for (int i = 0; i < 5 ; i++) {
            int j =i+ new Random().nextInt(26 - i);
            char t = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,t);
        }
        sb.delete(5,26);
        System.out.println(sb);
        return sb.toString();
    }
}
