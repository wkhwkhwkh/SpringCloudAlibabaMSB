package com.utan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class test2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 10; i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "抽数");
                }
            });
        }
        executorService.shutdown();
    }
}
