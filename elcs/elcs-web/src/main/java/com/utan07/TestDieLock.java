package com.utan07;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestDieLock implements Runnable{

    public int flag = 1;

    static Object o1 = new Object(),o2 = new Object();


    @Override
    public void run() {
        if(flag == 1){
            synchronized (o1){
                try {
                    Thread.sleep(500); //不会释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("2222");
                }
            }
        }
        if(flag == 0){
            synchronized (o2){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("111111");
                }
            }
        }
    }

    //main方法，程序入口
    public static void main(String[] args) {
        TestDieLock testDieLock = new TestDieLock();
        TestDieLock testDieLock2 = new TestDieLock();
        testDieLock.flag = 1;
        testDieLock2.flag = 0;
        Thread thread = new Thread(testDieLock);
        Thread thread2 = new Thread(testDieLock2);
        thread.start();
        thread2.start();
    }
}
