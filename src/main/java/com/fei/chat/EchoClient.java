package com.fei.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat
 * @date 2019/10/11 11:30
 * @Copyright © 2019
 */
public class EchoClient {
    public static void main(String[] args) throws  Exception{
        Socket s = new Socket("127.0.0.1", 8080);
        BufferedReader in =
                new BufferedReader(     //处理换行
                        new InputStreamReader(  //处理编码
                                s.getInputStream(), "UTF-8"));


        PrintWriter out =
                new PrintWriter(        //处理换行
                        new OutputStreamWriter( //处理编码
                                s.getOutputStream(), "UTF-8"));


        while(true) {

            System.out.print("输入：");
            String msg = new Scanner(System.in).nextLine();
            out.println(msg);
            out.flush();
            String r = in.readLine();
            System.out.println("回声："+r);
        }
    }
}
