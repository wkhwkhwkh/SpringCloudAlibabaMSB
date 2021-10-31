package com.utan;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestNetWork {
    //main方法，程序入口
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("localhost");
        System.out.println(inetAddress);
        InetAddress inetAddress2 = InetAddress.getByName("127.0.0.1");
        System.out.println(inetAddress2);
        InetAddress inetAddress3 = InetAddress.getByName("192.168.1.111");
        System.out.println(inetAddress3);
        InetAddress inetAddress4 = InetAddress.getByName("DESKTOP-P1C6N0R");//计算机名
        System.out.println(inetAddress4);
        InetAddress inetAddress5 = InetAddress.getByName("www.baidu.com");//计算机名
        System.out.println(inetAddress5);
        System.out.println(inetAddress5.getHostName());//获取域名
        System.out.println(inetAddress5.getHostAddress());//获取ip


        InetSocketAddress inetSocketAddress = new InetSocketAddress("112.80.248.75",8080);
        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getPort());
        System.out.println(inetSocketAddress.getAddress());
    }
}
