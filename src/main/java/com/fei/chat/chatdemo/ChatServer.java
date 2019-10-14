package com.fei.chat.chatdemo;

import com.fei.adpterobject.Source;
import com.fei.chat.TongXinThread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat.chatdemo
 * @date 2019/10/11 14:18
 * @Copyright © 2019
 */
public class ChatServer {
    private ArrayList<TongXinThread1> list=new ArrayList<>();
     public void launch(){
         new Thread(){
             @Override
             public void run() {
                 try {
                     ServerSocket serverSocket = new ServerSocket(8080);
                     System.out.println("服务已经在8080端口启动");
                     while (true){
                         Socket accept = serverSocket.accept();
                         System.out.println("一个客户端上线");
                         TongXinThread1 tongXinThread1 = new TongXinThread1(accept);
                         tongXinThread1.start();
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                     System.out.println("服务无法在8080端口启动，或者服务异常停止");
                 }

             }
         }.start();
     }

    private class TongXinThread1 extends Thread{
         Socket accept;
         BufferedReader in;
         PrintWriter out;
         private String name;
         public TongXinThread1(Socket accept){
             this.accept=accept;
         }
         public void send(String msg){
             out.println(msg);
             out.flush();
         }
         public void sendAll(String msg){
             for (TongXinThread1 t : list) {
                t.send(msg);
             }
         }

        @Override
        public void run() {
             try {
                 this.in=new BufferedReader(new InputStreamReader(accept.getInputStream(),"UTF-8"));
                 this.out=new PrintWriter(new OutputStreamWriter(accept.getOutputStream(),"UTF-8"));
                 this.name=in.readLine();
                 send(name+",欢迎你进入激情聊天室！");
                 list.add(this);
                 sendAll(name+"已经进入了聊天室");
                 String line;
                 while ((line=in.readLine())!=null)
                 {
                     sendAll(name+"说："+line);
                 }

             }catch (Exception e){
                 e.printStackTrace();
             }
             list.remove(this);
             sendAll(name+"已经离开了聊天室！");
        }
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.launch();
    }
}
