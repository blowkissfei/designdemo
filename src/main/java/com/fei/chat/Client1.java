package com.fei.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.chat
 * @date 2019/10/11 11:13
 * @Copyright © 2019
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8080);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        out.write("hello".getBytes());
        out.flush();
        for (int i = 0; i < 5 ; i++) {
            char c = (char) in.read();
            System.out.println(c);
        }
        socket.close();
    }
}
