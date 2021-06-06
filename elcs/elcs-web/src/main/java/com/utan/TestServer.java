package com.utan;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestServer {
    //main方法，程序入口
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();//阻塞,一直等待客户端发送消息
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String content = dis.readUTF();
        System.out.println(content);

        //响应客户端
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("我已收到:"+content);
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
