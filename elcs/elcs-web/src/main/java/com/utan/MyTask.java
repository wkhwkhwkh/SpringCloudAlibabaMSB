package com.utan;

import java.util.concurrent.CountDownLatch;

public class MyTask implements Runnable{

    private CountDownLatch begin;

    private CountDownLatch countDownLatch;

    public MyTask(CountDownLatch begin,CountDownLatch countDownLatch){
        this.begin = begin;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行完成!");
        try {
            begin.await();
            new MyLinkedList();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            countDownLatch.countDown();
        }
    }
}
