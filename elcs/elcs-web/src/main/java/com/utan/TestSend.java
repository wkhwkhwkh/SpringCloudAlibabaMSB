package com.utan;

import org.omg.Messaging.SyncScopeHelper;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Scanner;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * UDP 发送方
 */
public class TestSend {
    //main方法，程序入口
    public static void main(String[] args) throws IOException {
        System.out.println("上线");
        //准备套接字
        DatagramSocket ds = new DatagramSocket(9999);

        //准备数据包
        //String str = "你好,我想学编程";
        Scanner scanner = new Scanner(System.in);

        byte[] bytes = scanner.next().getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),8888);

        //发送
        ds.send(dp);

        //接受回来的响应
        byte[] b = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(b,b.length);
        ds.receive(dp2);
        System.out.println(new String(dp2.getData(),0,dp2.getLength()));
        ds.close();
    }
}
