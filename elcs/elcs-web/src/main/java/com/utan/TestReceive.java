package com.utan;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestReceive {
    //main方法，程序入口
    public static void main(String[] args) throws IOException {
        System.out.println("上线");
        //创建套接字
        DatagramSocket ds = new DatagramSocket(8888);

        //有一个空的数据包，打算用来接受对方传过来的数据包
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);
        //接受对方数据包，然后放入我们的dp数据包中
        ds.receive(dp);//接受完以后dp里面就填充好内容了
        //取出数据
        byte [] bytes = dp.getData();
        String content = new String(bytes,0,dp.getLength());//数据包的有效长度
        System.out.println(content);


        Scanner scanner = new Scanner(System.in);

        //响应回去
        byte[] b2 = scanner.next().getBytes();
        DatagramPacket dp2 = new DatagramPacket(b2,b2.length, InetAddress.getByName("localhost"),9999);
        ds.send(dp2);
        ds.close();
    }
}
