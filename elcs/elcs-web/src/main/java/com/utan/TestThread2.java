package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestThread2 {
    //main方法，程序入口
    public static void main(String[] args) {
        Thread2 testThread2 = new Thread2();
        Thread thread = new Thread(testThread2,"子线程");
        thread.start();
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+"======="+i);
        }
    }
}
