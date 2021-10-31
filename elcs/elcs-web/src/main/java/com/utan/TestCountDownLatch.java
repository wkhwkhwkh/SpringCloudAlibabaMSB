package com.utan;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

    public static void main(String[] args) throws Exception{
        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for(int i = 0; i < 5; i++){
            //Thread.sleep(500);
            MyTask myTask = new MyTask(begin,countDownLatch);
            new Thread(myTask).start();
        }
        System.out.println(1111);
        begin.countDown();
        countDownLatch.await();

        System.out.println("全部完成");
    }
}
