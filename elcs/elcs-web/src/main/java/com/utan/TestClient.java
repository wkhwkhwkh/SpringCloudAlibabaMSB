package com.utan;

import java.io.*;
import java.net.Socket;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestClient {
    //main方法，程序入口
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.111",8080);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好");

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String response = dis.readUTF();
        System.out.println(response);
        dis.close();
        dos.close();
        s.close();
    }
}
