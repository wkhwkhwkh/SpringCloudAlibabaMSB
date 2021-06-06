package com.utan05;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class BuyTicketThread extends Thread{
    static Object o = new Object();
    static int ticketNum = 100;

    @Override
    public void run() {
        for(int i =0; i < 100; i++){
            //BuyTicketThread.class 使用字节码信息作为锁
            buy();
        }
    }

    public static synchronized void buy(){ //static一定要加，不然还是没锁柱
        if(ticketNum > 0)
            System.out.println("我在"+Thread.currentThread().getName()+
                    "买了北京到上海的第"+ticketNum--+"张票");
    }
}
