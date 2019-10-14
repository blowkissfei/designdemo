package com.fei.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat
 * @date 2019/10/11 11:21
 * @Copyright © 2019
 */
public class EchoServer {

    public void launch(){
        new Thread(){
            @Override
            public void run() {
                try {
                    ServerSocket serverSocket = new ServerSocket(8080);
                    System.out.println("服务已经在 8080 端口上启动");
                    while (true){
                        Socket accept = serverSocket.accept();
                        System.out.println("一个客户端上线");
                        TongXinThread t = new TongXinThread(accept);
                        t.start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println(
                            "服务无法在8080端口启动，或者服务异常停止");
                }
            }
        }.start();
    }




    public static void main(String[] args) {
        EchoServer s = new EchoServer();
        s.launch();
    }
}
