package com.utan02;

import com.utan.Thread1;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Test {
    //main方法，程序入口
    public static void main(String[] args) {

        BuyTicketThread buyTicketThread = new BuyTicketThread();
        Thread t1 = new Thread(buyTicketThread,"窗口一");
        t1.start();

        Thread t2 = new Thread(buyTicketThread,"窗口二");
        t2.start();

        Thread t3 = new Thread(buyTicketThread,"窗口三");
        t3.start();
    }
}
