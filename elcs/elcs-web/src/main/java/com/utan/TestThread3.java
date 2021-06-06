package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(this.getName()+"====="+i);
        }
    }
}

class TestThread4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(this.getName()+"====="+i);
        }
    }
}

class Test10{
    //main方法，程序入口
    public static void main(String[] args) {
        TestThread3 t3 = new TestThread3();
        t3.setName("t3线程");
        t3.setPriority(10);//级别高获取cpu概率高,并不是一定先执行
        t3.start();

        TestThread4 t4 = new TestThread4();
        t4.setName("t4线程");
        t4.setPriority(1);
        t4.start();
    }
}
