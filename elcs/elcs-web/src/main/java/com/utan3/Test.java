package com.utan3;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Test {
    //main方法，程序入口
    public static void main(String[] args) {
        BuyTicketThread buyTicketThread = new BuyTicketThread();
        buyTicketThread.start();
        BuyTicketThread buyTicketThread2 = new BuyTicketThread();
        buyTicketThread2.start();
        BuyTicketThread buyTicketThread3 = new BuyTicketThread();
        buyTicketThread3.start();
    }
}
