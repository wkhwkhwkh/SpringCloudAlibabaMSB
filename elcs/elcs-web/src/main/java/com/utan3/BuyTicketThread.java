package com.utan3;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class BuyTicketThread extends Thread{
    static Object o = new Object();
    int ticketNum = 100;

    @Override
    public void run() {
        for(int i =0; i < 100; i++){
            //BuyTicketThread.class 使用字节码信息作为锁
            synchronized (o){//将具有安全隐患的代码锁住即可,this就是这个锁(锁一定要唯一)
                if(ticketNum > 0)
                    System.out.println("我在"+Thread.currentThread().getName()+
                            "买了北京到上海的第"+ticketNum--+"张票");
            }
        }
    }
}
