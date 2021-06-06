package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestThread {
    //main方法，程序入口
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        Thread1 thread1 = new Thread1();
        thread1.setName("子线程");
        thread1.start();

        for (int i =0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+"======="+i);
        }
    }
}
