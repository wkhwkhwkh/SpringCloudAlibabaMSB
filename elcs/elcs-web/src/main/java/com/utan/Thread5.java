package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Thread5 extends Thread{

    public Thread5(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(this.getName()+"====="+i);
        }
    }
}

class TestThread5{
    //main方法，程序入口
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 100; i++){
            if(i == 6){
                Thread5 thread5 = new Thread5("子线程");
                thread5.start();
                thread5.join();//当一个线程调用join方法，这个线程就会先被执行，他执行结束以后才会去执行其余的线程
            }
            System.out.println(Thread.currentThread().getName()+"====="+i);
        }
    }
}
