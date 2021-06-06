package com.utan04;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable{

    int ticketNum = 100;
    @Override
    public void run() {
        for(int i =0; i < 100; i++){
                buy();
        }
    }

    public synchronized void buy(){//同步方法
        if(ticketNum > 0)
            System.out.println("我在"+Thread.currentThread().getName()+
                    "买了北京到上海的第"+ticketNum--+"张票");
    }
}
