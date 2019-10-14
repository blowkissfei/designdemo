package com.fei.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat
 * @date 2019/10/11 11:26
 * @Copyright © 2019
 */
public class TongXinThread  extends Thread{
    Socket s;
    public TongXinThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try{
            BufferedReader in = new BufferedReader(     //处理换行
                            new InputStreamReader(  //处理编码
                                    s.getInputStream(), "UTF-8"));
            PrintWriter out =
                    new PrintWriter(        //处理换行
                            new OutputStreamWriter( //处理编码
                                    s.getOutputStream(), "UTF-8"));

            String line;
            while((line = in.readLine()) != null) {
                out.println(line);//必须有 ln
                out.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("一个客户端断开");
    }
}
