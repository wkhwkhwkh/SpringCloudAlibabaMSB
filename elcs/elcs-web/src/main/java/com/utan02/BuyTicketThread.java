package com.utan02;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable{

    int ticketNum = 100;
    @Override
    public void run() {
        for(int i =0; i < 100; i++){
            synchronized (this){//将具有安全隐患的代码锁住即可,this就是这个锁(锁一定要唯一)
                if(ticketNum > 0)
                    System.out.println("我在"+Thread.currentThread().getName()+
                            "买了北京到上海的第"+ticketNum--+"张票");
            }
        }
    }
}
