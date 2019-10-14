package com.fei.chat.chatdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat.chatdemo
 * @date 2019/10/11 14:41
 * @Copyright © 2019
 */
public class ChatClient {
    private Socket s;
    private BufferedReader in;
    private PrintWriter out;
    private String name;
    public void launch(){
        try {
            this.s=new Socket("127.0.0.1",8080);
            this.in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
            this.out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
            System.out.println("取个昵称：");
            this.name=new Scanner(System.in).nextLine();
            out.println(name);
            out.flush();
            new Thread(){
                @Override
                public void run() {
                    receive();
                }
            }.start();

            new Thread(){
                @Override
                public void run() {
                    input();
                }
            }.start();





        }catch (Exception e){
            e.printStackTrace();
            System.out.println("无法连接服务器");
        }
    }

    private void input() {
        while (true){
            System.out.println("输入聊天内容：");
            String s=new Scanner(System.in).nextLine();
            out.println(s);
            out.flush();
        }
    }

    private void receive() {
        try {
            String line;
            while ((line=in.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){

        }
        System.out.println("已经与服务器断开连接");
    }


    public static void main(String[] args) {
        ChatClient c = new ChatClient();
        c.launch();
    }
}
