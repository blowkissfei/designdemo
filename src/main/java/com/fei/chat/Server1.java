package com.fei.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat
 * @date 2019/10/11 11:06
 * @Copyright © 2019
 */
public class Server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("服务已经在 8080 端口上启动");
        //等待客户端发起连接
        //建立连接通道后，返回插头对象
        Socket accept = server.accept();
        System.out.println("客户端已连接");
        InputStream in = accept.getInputStream();
        OutputStream out = accept.getOutputStream();
        for (int i = 0; i < 5; i++) {
            char c = (char) in.read();
            System.out.println(c);
        }

        out.write("world".getBytes());
        out.flush();//刷出本地内存中的缓存数据
        accept.close();//断开和客户端的连接，拔掉插头
        server.close();//停止服务，释放端口


    }


}
