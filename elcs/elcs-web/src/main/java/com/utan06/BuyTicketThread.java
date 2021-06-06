package com.utan06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * Lock使用
 */
public class BuyTicketThread implements Runnable{

    int ticketNum = 100;

    //获得一把锁
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for(int i =0; i < 100; i++){
            lock.lock();//打开锁
            try {
                if(ticketNum > 0)
                    System.out.println("我在"+Thread.currentThread().getName()+
                            "买了北京到上海的第"+ticketNum--+"张票");
            }finally {
                lock.unlock();//关闭锁  无论是否发生异常都要将锁关闭
            }
        }
    }
}
